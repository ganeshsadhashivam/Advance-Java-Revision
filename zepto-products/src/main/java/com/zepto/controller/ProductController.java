package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zepto.request.ProductRequest;
import com.zepto.service.ProductService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("saveProduct")
	@ResponseBody
	public String uploadProduct(@ModelAttribute ProductRequest productRequest)
	{
	long productId = 	productService.createProduct(productRequest);
	
	return "Product has been uploaded and product id is " + productId;
	}
	
	
	
	
	@GetMapping("showSearchPage")
	public String showSearchPage()
	{
	
	return "search-product";
	}
	
	
	@GetMapping("search")
	@ResponseBody
	public String searchProduct(@RequestParam("productName") String searchTerm)
	{
	
	String response = productService.searchProduct(searchTerm);
	
	return response ;
	}
	
	
	
	
	
	
}
