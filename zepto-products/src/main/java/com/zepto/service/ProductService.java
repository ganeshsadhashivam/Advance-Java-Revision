package com.zepto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.CategoryEntity;
import com.zepto.entity.ProductEntity;
import com.zepto.repository.CategoryRepository;
import com.zepto.repository.ProductRepository;
import com.zepto.request.ProductRequest;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public String searchProduct(String inputString)
	{
		String response = null;
//	List<ProductEntity>	products=(List<ProductEntity>) productRepository.findAll();
//	
//	for(ProductEntity entity : products) {
//		
//		if(entity.getProductName().equalsIgnoreCase(inputString))
//		{
//			System.out.println("Product Found");
//			response=entity.getProductName() + " , " + entity.getProductId() + " , " + entity.getQuantity();
//			break;
//		}
//		
//	}
		
		/*
		 * using method derivation method
		 * 
		 */
	ProductEntity	 product=productRepository.findProductByProductName(inputString);
	response=product.getProductName() + " , " + product.getProductId() + " , " + product.getQuantity();
	return response;
	}
	
	
	
	
	
	
	public long createProduct(ProductRequest productRequest)
	{
		
		ProductEntity productEntity  = new ProductEntity();
		productEntity.setBrand(productRequest.getBrand());
//		productEntity.setCategory(productRequest.getCategory());
		productEntity.setDescription(productRequest.getDescription());
		productEntity.setPrice(productRequest.getPrice());
		productEntity.setProductName(productRequest.getProductName());
		productEntity.setQuantity(productRequest.getQuantity());
		
		
//		CategoryEntity categoryEntity  = new CategoryEntity();
		
		CategoryEntity categoryEntity = categoryRepository.findById(1L).orElseThrow(); 
		
		categoryEntity.setCategory(productRequest.getCategory());
		categoryEntity.setStatus("Active");
		
		productEntity.setCategory(categoryEntity);
		
		//create a record in table
		ProductEntity responseEntity =    productRepository.save(productEntity);
		
	   long productId =responseEntity.getProductId();
		
		if(productId > 0)
			
		{
			System.out.println("product created and id is" + responseEntity.getProductId());
		}
		else
		{
			System.out.println("unable to create product");
		}
		
		return productId;
	}
}
