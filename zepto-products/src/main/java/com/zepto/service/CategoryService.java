package com.zepto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zepto.entity.CategoryEntity;
import com.zepto.repository.CategoryRepository;

@Service
public class CategoryService {
	    @Autowired
	    private CategoryRepository categoryRepository;

	    @Transactional
	    public void testNPlusOne() {

	        List<CategoryEntity> categories = (List<CategoryEntity>) categoryRepository.findAll();
	    	
	    	
//	    	List<CategoryEntity> categories = (List<CategoryEntity>) categoryRepository.findAllWithProducts();

	        System.out.println("Total Categories : " + categories.size());

	        for (CategoryEntity category : categories) {

	            System.out.println("--------------------------------");
	            System.out.println(category.getCategory());

	            System.out.println("Products : " + category.getProducts().size());

	        }

	    }
}
