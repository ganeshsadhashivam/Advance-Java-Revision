package com.ecommerce.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class LogOutController {

	 @PostMapping("logout")
	    public String logout(HttpSession session) {

	        session.invalidate();
System.out.println("in logout");
	        return "signup-page";
	    }
}
