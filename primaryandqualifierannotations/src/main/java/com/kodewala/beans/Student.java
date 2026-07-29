package com.kodewala.beans;

public class Student {

	private String name;
	
	private String department;
	
	private String college;

	public Student(String name, String department, String college) {
		super();
		this.name = name;
		this.department = department;
		this.college = college;
	}

	
	public void display() {
		System.out.println("Student [name=" + name + ", department=" + department + ", college=" + college + "]");
	}
	
	
}
