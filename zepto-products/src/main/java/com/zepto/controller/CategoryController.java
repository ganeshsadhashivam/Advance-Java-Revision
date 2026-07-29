package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	
	@ResponseBody
	@GetMapping("/test")
	public String test()
	{
		categoryService.testNPlusOne();
		
		return "Check Console";
	}
}

