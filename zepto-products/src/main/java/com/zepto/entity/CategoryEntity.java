package com.zepto.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="categories") //parent
public class CategoryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long category_id;
	
	private String category;
	
	private String status;
	
	/*
	 * c++ book category_id 6
	 * Atomic Habits book category_id 1 so its wrong
	 */
	
//	@OneToOne(mappedBy = "category")
//	private ProductEntity product;
	
	/*
	 * a category has many products like Ex soap 
	 * bath,detergent soap etc
	 */
	@OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private List<ProductEntity> products;

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public List<ProductEntity> getProducts() {
	    return products;
	}

	public void setProducts(List<ProductEntity> products) {
	    this.products = products;
	}
	
}
