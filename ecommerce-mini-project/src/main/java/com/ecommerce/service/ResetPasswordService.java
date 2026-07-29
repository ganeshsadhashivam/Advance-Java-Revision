package com.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.ChangePasswordRequest;
import com.ecommerce.model.User;
import com.ecommerce.repository.SignUpRepository;

@Service
public class ResetPasswordService {

	@Autowired
	SignUpRepository signUpRepository;
	
	public boolean resetPassword(String email,ChangePasswordRequest request)
	{
		User user = signUpRepository.findByEmail(email);
		
		if(user == null)
		{
			return false;
		}
		
		
		if(request.getNewPassword() == null ||request.getConfirmPassword() == null)
		{
		 return false;
		}

		if(!request.getNewPassword().equals(request.getConfirmPassword()))
		{
		return false;
		}
		  
		user.setPassword(request.getNewPassword());
		  

	    user.setConfirmPassword(request.getConfirmPassword());

	    return true;
	}
}
