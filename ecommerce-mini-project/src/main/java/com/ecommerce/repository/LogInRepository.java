package com.ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.User;

@Repository
public class LogInRepository {
	
	@Autowired
	SignUpRepository singUpRepository;

	public User findByEmail(String email)
	{
		List<User> users = singUpRepository.findAll();
		
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
