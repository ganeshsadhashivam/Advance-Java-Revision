package com.flipkart.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.flipkart.entity.ProductEntity;
import com.flipkart.repository.ProductRepository;
import com.flipkart.request.ProductRequest;
import com.flipkart.response.ProductResponse;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public ProductResponse createProduct(ProductRequest productRequest)
	{
		ProductEntity productEntity = new ProductEntity();
		 productEntity.setProductName(productRequest.getProductName());
	        productEntity.setDescription(productRequest.getDescription());
	        productEntity.setCategory(productRequest.getCategory());
	        productEntity.setBrand(productRequest.getBrand());
	        productEntity.setPrice(productRequest.getPrice());
	        productEntity.setStock(productRequest.getStock());
	        productEntity.setImages(productRequest.getImages());
	        productEntity.setActive(productRequest.getActive());

	        productEntity.setCreatedAt(LocalDateTime.now());
	        productEntity.setUpdatedAt(LocalDateTime.now());
	        
	       ProductEntity savedProduct  = productRepository.save(productEntity);
	       
	       ProductResponse response = new ProductResponse();

	       response.setId(savedProduct.getId());
	       response.setProductName(savedProduct.getProductName());
	       response.setDescription(savedProduct.getDescription());
	       response.setCategory(savedProduct.getCategory());
	       response.setBrand(savedProduct.getBrand());
	       response.setPrice(savedProduct.getPrice());
	       response.setStock(savedProduct.getStock());
	       response.setImages(savedProduct.getImages());
	       response.setActive(savedProduct.getActive());
	       response.setCreatedAt(savedProduct.getCreatedAt());
	       response.setUpdatedAt(savedProduct.getUpdatedAt());

	       return response;

	}
	
	
	public List<ProductResponse> getAllProducts() {

	    System.out.println("Fetching all products from DB...");

	    List<ProductEntity> products = productRepository.findAll();

	    List<ProductResponse> responseList = new ArrayList<>();

	    for (ProductEntity product : products) {

	        ProductResponse response = new ProductResponse();

	        response.setId(product.getId());
	        response.setProductName(product.getProductName());
	        response.setDescription(product.getDescription());
	        response.setCategory(product.getCategory());
	        response.setBrand(product.getBrand());
	        response.setPrice(product.getPrice());
	        response.setStock(product.getStock());
	        response.setImages(product.getImages());
	        response.setActive(product.getActive());
	        response.setCreatedAt(product.getCreatedAt());
	        response.setUpdatedAt(product.getUpdatedAt());

	        responseList.add(response);
	    }

	    return responseList;
	}
	
	@Cacheable(value="products",key = "#name")
	public List<ProductResponse> searchProducts(String name)
	
	{
		System.out.println("Fetching from DB...");
		
		List<ProductEntity> products=productRepository.findByProductNameContainingIgnoreCase(name);
		
		List<ProductResponse> responseList = new ArrayList<>();
		
		for(ProductEntity product : products)
		{
			ProductResponse response = new ProductResponse();
			
			response.setId(product.getId());
			response.setProductName(product.getProductName());
	        response.setDescription(product.getDescription());
	        response.setCategory(product.getCategory());
	        response.setBrand(product.getBrand());
	        response.setPrice(product.getPrice());
	        response.setStock(product.getStock());
	        response.setImages(product.getImages());
	        response.setActive(product.getActive());
	        response.setCreatedAt(product.getCreatedAt());
	        response.setUpdatedAt(product.getUpdatedAt());
	        
	        responseList.add(response);
		}
		
		return responseList;
	}
	
	public ProductResponse getProductById(String id)
	{
		ProductEntity product= productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
	
		ProductResponse response = new ProductResponse();
		
		response.setId(product.getId());
		response.setProductName(product.getProductName());
        response.setDescription(product.getDescription());
        response.setCategory(product.getCategory());
        response.setBrand(product.getBrand());
        response.setPrice(product.getPrice());
        response.setStock(product.getStock());
        response.setImages(product.getImages());
        response.setActive(product.getActive());
        response.setCreatedAt(product.getCreatedAt());
        response.setUpdatedAt(product.getUpdatedAt());
        
        return response;
	}
	
	
	public ProductResponse updateProduct(String id,ProductRequest productRequest)
	{
		ProductEntity product= productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
	
	
		product.setProductName(productRequest.getProductName());
		 product.setDescription(productRequest.getDescription());
		    product.setCategory(productRequest.getCategory());
		    product.setBrand(productRequest.getBrand());
		    product.setPrice(productRequest.getPrice());
		    product.setStock(productRequest.getStock());
		    product.setImages(productRequest.getImages());
		    product.setActive(productRequest.getActive());
		    
		    // Keep the original createdAt
		    product.setUpdatedAt(LocalDateTime.now());
		    
		ProductEntity  updatedProduct = productRepository.save(product);
		
		 ProductResponse response = new ProductResponse();

		    response.setId(updatedProduct.getId());
		    response.setProductName(updatedProduct.getProductName());
		    response.setDescription(updatedProduct.getDescription());
		    response.setCategory(updatedProduct.getCategory());
		    response.setBrand(updatedProduct.getBrand());
		    response.setPrice(updatedProduct.getPrice());
		    response.setStock(updatedProduct.getStock());
		    response.setImages(updatedProduct.getImages());
		    response.setActive(updatedProduct.getActive());
		    response.setCreatedAt(updatedProduct.getCreatedAt());
		    response.setUpdatedAt(updatedProduct.getUpdatedAt());
		    
		    return response;
	}
	
	public String deleteProduct(String id) {

	    ProductEntity product = productRepository.findById(id)
	            .orElseThrow(() ->
	                    new RuntimeException("Product not found with id: " + id));

	    productRepository.delete(product);

	    return "Product deleted successfully";
	}
	
}
