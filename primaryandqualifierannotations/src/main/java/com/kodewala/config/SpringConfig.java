package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.kodewala.beans.Student;

@Configuration
@ComponentScan(basePackages = "com.kodewala")
public class SpringConfig {

	@Bean("ganesh")
	@Primary
	/*
	 * @Primary is a default 
	 */
	public Student createStudentGanesh()
	{
		Student ganesh = new Student("ganesh", "Mca", "Kcet");
		return ganesh;
	}
	
	@Bean("george")
	public Student createStudentGeorge()
	{
		Student george = new Student("george", "Mca", "Kcet");
		return george;
	}
}
