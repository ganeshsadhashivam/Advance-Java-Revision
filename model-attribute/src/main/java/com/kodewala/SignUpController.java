package com.kodewala;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kodewala.pojo.SignUpPojo;

@Controller
public class SignUpController {

	@PostMapping("signUp")
	public String doSignUp(@ModelAttribute SignUpPojo request,Model model)
	{
		
		System.out.println(request.getFirstName());
		System.out.println(request.getLastName());
		System.out.println(request.getEmail());
		System.out.println(request.getMobileNumber());
		
		// after registration 
		String userId = "USER5";
		
		//setting the response data available on page
		model.addAttribute("user",userId );
		return "signup-success";
	}
}
