package com.kw.acedemy;

public class Students extends Parent{

    private String studentName;
	
	private String studentId;
	
	
	Students()
	{
		
	}
	
	Students(String _studentName,String _studentId,String _name, String _from, boolean _wallet) {
		super(_name, _from, _wallet);
		
		this.studentName = _studentName;
		this.studentId = _studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	
	public void displayStudentProfile() {
        System.out.println("======= ACADEMY PROFILE =======");
        System.out.println("ID:      " + studentId);
        System.out.println("Student: " + studentName);
        System.out.println("Parent:  " + getName());
        System.out.println("City:    " + getFrom());
        System.out.println("Wallet:  " + (isWallet() ? "Active" : "Inactive"));
        System.out.println("===============================");
    }
	
	
	
	
	
	
}
