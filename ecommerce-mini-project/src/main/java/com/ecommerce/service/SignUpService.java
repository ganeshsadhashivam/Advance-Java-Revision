package com.ecommerce.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.SignUpRepository;

@Service
public class SignUpService {

	@Autowired
	SignUpRepository signUpRepository;
	
	public boolean doSignUp(User userRequest)
	{
//		if(!userRequest.getPassword().equals(userRequest.getConfirmPassword()))
//		{
//			return false;
//		}
		if(userRequest.getPassword() == null ||
				   userRequest.getConfirmPassword() == null ||
				   !userRequest.getPassword()
				       .equals(userRequest.getConfirmPassword()))
				{
				    return false;
				}
		
		
		return signUpRepository.add(userRequest);
	}
}
