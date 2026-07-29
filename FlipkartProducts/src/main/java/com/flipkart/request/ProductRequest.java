package com.flipkart.request;

import java.util.List;

public class ProductRequest {
	
	

	    private String productName;

	    private String description;

	    private String category;

	    private String brand;

	    private Double price;

	    private Integer stock;

	    private List<String> images;

	    private Boolean active;

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Integer getStock() {
			return stock;
		}

		public void setStock(Integer stock) {
			this.stock = stock;
		}

		public List<String> getImages() {
			return images;
		}

		public void setImages(List<String> images) {
			this.images = images;
		}

		public Boolean getActive() {
			return active;
		}

		public void setActive(Boolean active) {
			this.active = active;
		}

		
	    
	    
}
