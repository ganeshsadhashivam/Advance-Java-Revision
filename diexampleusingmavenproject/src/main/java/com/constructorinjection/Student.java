package com.constructorinjection;

public class Student {

	private String name;
	
	private String lastName;
	
	private String address;
	
	private String joinedCourse;

	public Student(String name, String lastName, String address, String joinedCourse) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.joinedCourse = joinedCourse;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", lastName=" + lastName + ", address=" + address + ", joinedCourse="
				+ joinedCourse + "]";
	}
	
	
}
