package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.request.ProductRequest;
import com.flipkart.response.ProductResponse;
import com.flipkart.service.ProductService;

@RestController
@RequestMapping("/api/")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("create/product")
	public ProductResponse createProduct(@RequestBody ProductRequest productRequest)
	{
	 return	productService.createProduct(productRequest);
	}
	
	
	@GetMapping("search")
	public List<ProductResponse> searchProducts(@RequestParam String name)
	{
		return productService.searchProducts(name);
	}
	
	@GetMapping("products")
	public List<ProductResponse> getAllProducts() {
	    return productService.getAllProducts();
	}
	
	 @GetMapping("products/{id}")
	public ProductResponse getProductById(@PathVariable String id)
	{
		return productService.getProductById(id);
	}
	 @PutMapping("products/{id}")
	public ProductResponse updateProduct(@PathVariable String id,@RequestBody ProductRequest productRequest)
	{
		return productService.updateProduct(id, productRequest);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteProduct(@PathVariable String id) {
	    return productService.deleteProduct(id);
	}
}
