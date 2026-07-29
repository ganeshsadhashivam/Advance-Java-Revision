package com.fieldinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class InstituteOfFieldInjection {

	@Value("Suresh Bisnoi")
	private String mentor; 

	@Value("KodeWala")
	private String academyName;
	
	@Value("Java Full Stack , HLD,LLD Preparation,Interview Preparation")
	private String coursesOffered;
	
	@Value("BTM Layout , Bangalore")
	private String address;
	
	@Value("Karnataka")
	private String state;
	
	
	@Autowired
	private StudentOfFieldInjection studentOfFieldInjection;


	@Override
	public String toString() {
		return "InstituteOfFieldInjection [mentor=" + mentor + ", academyName=" + academyName + ", coursesOffered="
				+ coursesOffered + ", address=" + address + ", state=" + state + ", studentOfFieldInjection="
				+ studentOfFieldInjection + "]";
	}
	
	
}
