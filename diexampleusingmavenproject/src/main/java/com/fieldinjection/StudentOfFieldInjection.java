package com.fieldinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class StudentOfFieldInjection {

	@Value("S Ganesh")
    private String name;
	
	@Value("Sadhashivam")
	private String lastName;
	
	@Value("141, Bazzar Street , Chidambaram")
	private String address;
	
	@Value("Java Full Stack")
	private String joinedCourse;

	@Override
	public String toString() {
		return "StudentOfFieldInjection [name=" + name + ", lastName=" + lastName + ", address=" + address
				+ ", joinedCourse=" + joinedCourse + "]";
	}
	
	
}
