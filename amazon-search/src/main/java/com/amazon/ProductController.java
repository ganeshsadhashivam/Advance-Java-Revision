package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

	@GetMapping("viewProductPage")
	public String displayProductPage()
	{
		System.out.println("ProductController()::::::");
		return "product-search"; //view resolver -->WEB/INF/views/search/
	}
}
