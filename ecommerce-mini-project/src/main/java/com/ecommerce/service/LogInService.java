package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.LogInRepository;

@Service
public class LogInService {
	
	@Autowired
	LogInRepository logInRepository;

	public boolean doLogin(String email,String password)
	{
		User user = logInRepository.findByEmail(email);
		
		if(user == null)
		{
			return false;
		}
		
		return user.getPassword().equals(password);
	}
}
