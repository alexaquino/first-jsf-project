package br.com.fxcosta.repositories;

import java.util.List;

import org.hibernate.SessionFactory;

import br.com.fxcosta.entities.UserEntity;

public class UserRepository 
{
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory()
	{
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) 
	{
        this.sessionFactory = sessionFactory;
    }
	
	public void addUser(UserEntity user)
	{
		getSessionFactory().getCurrentSession().save(user);
	}
	
	public List<UserEntity> getUsers()
	{
		List list = getSessionFactory().getCurrentSession().createQuery("from user").list();
		return list;
	}
}
