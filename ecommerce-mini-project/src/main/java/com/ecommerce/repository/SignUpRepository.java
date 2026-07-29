package com.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public class SignUpRepository {

	private List<User> users = new ArrayList<>();
	
	public boolean add(User user)
	{
		return users.add(user);
	}
	
	public List<User> findAll()
	{
		return users;
	}
	
	
	public User findByEmail(String email)
	{
		for(User user : users)
		{
			if(user.getEmail().equals(email))
			{
				return user;
			}
		}
		
		return null;
	}
	
}
