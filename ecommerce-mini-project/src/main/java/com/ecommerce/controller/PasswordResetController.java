package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ecommerce.model.ChangePasswordRequest;
import com.ecommerce.service.ResetPasswordService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PasswordResetController {

	
	@Autowired
	ResetPasswordService resetPasswordService;
	
	@PostMapping("changePassword")
	public String changePassword(@ModelAttribute ChangePasswordRequest changePasswordRequest,HttpSession session,Model model)
	{
		String email = (String) session.getAttribute("loggedInEmail");
		
		boolean isUpdated =resetPasswordService.resetPassword(email,changePasswordRequest);

        if(isUpdated) {

            model.addAttribute(
                    "successMessage",
                    "Password Updated Successfully");

            return "home-page";
        }

        model.addAttribute(
                "errorMessage",
                "Password Update Failed");

        return "reset-password";
	}
}
