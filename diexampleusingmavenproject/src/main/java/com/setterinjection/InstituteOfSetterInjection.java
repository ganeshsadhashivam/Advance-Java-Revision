package com.setterinjection;

import com.setterinjection.StudentOfSetterInjection;

public class InstituteOfSetterInjection {

	private String mentor; 

	private String academyName;
	
	private String coursesOffered;
	
	private String address;
	
	private String state;

	private StudentOfSetterInjection studentOfSetterInjection;

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public void setCoursesOffered(String coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStudent(StudentOfSetterInjection studentOfSetterInjection) {
		this.studentOfSetterInjection = studentOfSetterInjection;
	}

	@Override
	public String toString() {
		return "InstituteOfSetterInjection [mentor=" + mentor + ", academyName=" + academyName + ", coursesOffered="
				+ coursesOffered + ", address=" + address + ", state=" + state + ", studentOfSetterInjection="
				+ studentOfSetterInjection + "]";
	}

	
	
	
	
	
	
}
