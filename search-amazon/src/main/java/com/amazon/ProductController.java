package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

	@GetMapping("viewProductPage")
	public String displayProductPage()
	{
		System.out.println("pc():::::::");
		return "product-search";
	}
	
	
	@GetMapping("searchProduct")
	@ResponseBody
	public String searchProducts(@RequestParam("searchText") String inputString)
	{
		System.out.println("search prod for : " + inputString);
		return "iphone is costly";
	}
}
