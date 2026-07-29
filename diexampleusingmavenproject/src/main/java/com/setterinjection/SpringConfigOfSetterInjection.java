package com.setterinjection;

import org.springframework.context.annotation.Bean;



public class SpringConfigOfSetterInjection {

	@Bean("BeanOfStudent")
	public StudentOfSetterInjection createStudentUsingSetterInjection()
	{
		StudentOfSetterInjection ganesh = new StudentOfSetterInjection("Ganesh", "Sadhashivam", "141 Bazzar Street, Chidamabaram", "Java Full Stack");
		return ganesh;
	}
	
	
	@Bean("BeanOfInstitute")
	public InstituteOfSetterInjection createInstitute()
	{
		/*
		 * Setter Injection in the end we are Setting createStudentUsingSetterInjection()
		 */
		InstituteOfSetterInjection kodeWala = new InstituteOfSetterInjection();
		kodeWala.setMentor("Suresh Bishnoi");
		kodeWala.setAcademyName("KodeWala");
		kodeWala.setCoursesOffered("Java Full Stack , HLD,LLD Preparation, Interview Preparation ");
		kodeWala.setAddress("BTM Layout ,Bangalore");
		kodeWala.setState("Karnataka");
		
		// Setter Injection
		kodeWala.setStudent(createStudentUsingSetterInjection());
		return kodeWala;
	}
}
