package br.com.fxcosta.beans;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.fxcosta.entities.UserEntity;
import br.com.fxcosta.repositories.UserRepository;

@Named
@RequestScoped
public class UserBean 
{

	private UserRepository userRepo = new UserRepository();
	
	public UserRepository getUserRepo() {
		return userRepo;
	}

	public void setUserRepo(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	public List<UserEntity> getUserList()
	{
		return this.userRepo.getUsers();
	}
}
