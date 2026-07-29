package dependencyinjection;

public class Student {

	private String name;
	private String address;
	private String courseEnrolled;
	private boolean feePaid;
	
	
	
	public Student(String name, String address, String courseEnrolled, boolean feePaid) {
		super();
		this.name = name;
		this.address = address;
		this.courseEnrolled = courseEnrolled;
		this.feePaid = feePaid;
	}



	public String getName() {
		return name;
	}



	public String getAddress() {
		return address;
	}



	public String getCourseEnrolled() {
		return courseEnrolled;
	}



	public boolean isFeePaid() {
		return feePaid;
	}
	
	
	
}
