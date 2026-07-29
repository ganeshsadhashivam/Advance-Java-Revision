package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerce.model.LogInRequest;
import com.ecommerce.service.LogInService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	LogInService logInService;

	@PostMapping("/login")
	public String loginHandler(@ModelAttribute LogInRequest logInRequest,Model model,HttpSession session)
	{
		System.out.println("in Login controller");
		boolean isValid = logInService.doLogin(logInRequest.getEmail(), logInRequest.getPassword());
		
		 if(isValid) {

			 
			 session.setAttribute(
		                "loggedInEmail",
		                logInRequest.getEmail());
			 System.out.println("Email = " + logInRequest.getEmail());
	            model.addAttribute(
	                    "successMessage",
	                    "Login Successful");
	            

	            return "home-page";
	        }

	        model.addAttribute(
	                "errorMessage",
	                "Invalid Email or Password");

		return "login-page";
	}
}
