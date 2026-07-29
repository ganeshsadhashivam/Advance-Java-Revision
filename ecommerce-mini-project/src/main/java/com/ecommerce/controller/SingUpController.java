package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerce.model.User;
import com.ecommerce.service.SignUpService;

import jakarta.validation.Valid;

@Controller
public class SingUpController {

	@Autowired
	SignUpService signUpService;
	
	@PostMapping("signUp")
	public String signUpHandler(@Valid @ModelAttribute User userRequest,BindingResult bindingResult,Model model)
	{
		System.out.println("Sign up controller");
		if (bindingResult.hasErrors()) {
	        return "signup-page";
	    }
		
		boolean isAdded = signUpService.doSignUp(userRequest);
		
		if(isAdded)
		{
			model.addAttribute("successMessage","User Added Successfully");
			return "login-page";
			
		}
		
		 model.addAttribute("errorMessage", "Passwords do not match");
		 
		 return "signup-page";
	}
}
