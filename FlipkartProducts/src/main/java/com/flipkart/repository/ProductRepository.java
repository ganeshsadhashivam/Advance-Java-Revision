package com.flipkart.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.ProductEntity;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity,String> {

	List<ProductEntity> findByProductNameContainingIgnoreCase(String productName);
}
