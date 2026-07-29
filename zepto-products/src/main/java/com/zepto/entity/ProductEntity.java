package com.zepto.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="products") //child
public class ProductEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long productId;
	
	private String productName;
	
//	private String category;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="category_id")
//	private CategoryEntity category;
	
	
	/*
	 * This means:

Saving a Product will also save the Category.
Updating a Product will also update the Category.
Deleting a Product will also delete the Category (CascadeType.REMOVE is part of ALL).
	 * Example

Suppose your database has:

categories
category_id	category
1	Books
products
productId	productName	category_id
1	Atomic Habits	1
2	C++ Book	1

Now you execute:
productRepository.deleteById(1L);

With CascadeType.ALL, Hibernate may try to delete the associated Category ("Books") as well. But that category is still referenced by another product (C++ Book), which can lead to:

Foreign key constraint violations, or
Unintended deletion if no other references exist.

Deleting one product should not delete its shared category.
so dont use (cascade=CascadeType.ALL) on No, you generally should not use CascadeType.ALL on a @ManyToOne relationship.
	 */
	@ManyToOne
	@JoinColumn(name="category_id")
	private CategoryEntity category;

	private String price;
	
	private String quantity;
	
	private String brand;
	
	private String description;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}

	
	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
