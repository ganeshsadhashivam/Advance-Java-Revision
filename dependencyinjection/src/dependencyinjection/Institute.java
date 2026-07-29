package dependencyinjection;

public class Institute {

	private String academyName;
	private String joinedCourse;
	private boolean feePending;
	private double pendingAmount;
	
	private Student studentInfo;
	
	
	
	//To create Institute object we need Student Object as Dependency
	/*
	 * This is Constructor injection
	 */
	public Institute(String academyName, String joinedCourse, boolean feePending, double pendingAmount,Student _studentInfo) {
		super();
		this.academyName = academyName;
		this.joinedCourse = joinedCourse;
		this.feePending = feePending;
		this.pendingAmount = pendingAmount;
		this.studentInfo = _studentInfo;
	}
	
	
	public Institute(String academyName, String joinedCourse, boolean feePending, double pendingAmount) {
		super();
		this.academyName = academyName;
		this.joinedCourse = joinedCourse;
		this.feePending = feePending;
		this.pendingAmount = pendingAmount;
		
	}
	
	public void setStudentInfo(Student _student)
	{
		studentInfo = _student;
	}
	
	
	
	
	
	public String getAcademyName() {
		return academyName;
	}


	public String getJoinedCourse() {
		return joinedCourse;
	}


	public boolean isFeePending() {
		return feePending;
	}


	public double getPendingAmount() {
		return pendingAmount;
	}


	public Student getStudentInfo() {
		return studentInfo;
	}


	public void display()
	{
		System.out.println(this.getAcademyName() + " " + this.getJoinedCourse() + " " + this.isFeePending() + " " + this.getPendingAmount() + " " + this.getStudentInfo().getName() + " " + this.getStudentInfo().getAddress() + " " + this.getStudentInfo().getCourseEnrolled() + " " + this.getStudentInfo().isFeePaid() );
		}
}
