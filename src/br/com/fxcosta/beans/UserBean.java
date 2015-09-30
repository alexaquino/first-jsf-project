package br.com.fxcosta.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.com.fxcosta.entities.UserEntity;
import br.com.fxcosta.repositories.UserRepository;

@ManagedBean(name = "userBean")
@RequestScoped
public class UserBean 
{
	public UserRepository userRepo = new UserRepository();
	
	public List<UserEntity> getUserList()
	{
		return this.userRepo.getUsers();
	}
}
