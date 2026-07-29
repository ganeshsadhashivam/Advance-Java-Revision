package com.kodewala.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kodewala.beans.Student;

@Component
public class StudentService {

	@Autowired
	@Qualifier("george")
	/*
	 * if you don't provide @Qualifier Annotation it will create @Bean of @Primary
	 * and if use used @Primary and @Qualifier Also @Primary Bean will Overridden with 
	 * @Qualifier Bean
	 */
	private Student student;
	
	
	public void displayStudentDetails()
	{
		student.display();
	}
}
