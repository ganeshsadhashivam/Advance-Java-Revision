package com.constructorinjection;

public class Institute {
	
	
	private String mentor; 

	private String academyName;
	
	private String coursesOffered;
	
	private String address;
	
	private String state;

	private Student student;
	
	
	
	
	
	public Institute(String mentor, String academyName, String coursesOffered, String address, String state, Student student) {
		super();
		this.mentor = mentor;
		this.academyName = academyName;
		this.coursesOffered = coursesOffered;
		this.address = address;
		this.state = state;
		
		this.student = student;
	}





	@Override
	public String toString() {
		return "Institute [mentor=" + mentor + ", academyName=" + academyName + ", coursesOffered=" + coursesOffered
				+ ", address=" + address + ", state=" + state + ", student=" + student + "]";
	}







	
	
	

	
	
}
