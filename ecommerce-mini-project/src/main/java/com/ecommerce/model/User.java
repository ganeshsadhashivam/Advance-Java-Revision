package com.ecommerce.model;

import jakarta.validation.constraints.NotBlank;

public class User {

	@NotBlank(message="Name is Required")
	private String name;
	
	@NotBlank(message = "Email is required")
	private String email;
	
	@NotBlank(message = "Mobile Number is required")
	private String mobileNumber;
	
	@NotBlank(message = "Password is required")
	private String password;
	
	@NotBlank(message = "Confirm Password is required")
	private String confirmPassword;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
