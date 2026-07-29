package com.constructorinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigOfConstructorInjection {

	@Bean("BeanOfStudent")
	public Student createStudent()
	{
		Student ganesh = new Student("Ganesh", "Sadhashivam", "141 Bazzar Street, Chidamabaram", "Java Full Stack");
		return ganesh;
	}
	
	
	@Bean("BeanOfInstitute")
	public Institute createInstitute()
	{
		/*
		 * Constructor Injection in the end we are passing createStudent()
		 */
		Institute kodeWala = new Institute("Suresh Bishnoi", "KodeWala", "Java Full Stack , HLD,LLD Preparation, Interview Preparation ", "BTM Layout ,Bangalore", "Karnataka",createStudent());
		return kodeWala;
	}
}
