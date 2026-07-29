package dependencyinjection;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student ganesh = new Student("ganesh", "141 bazzar street, chidambaram", "java full stack", false);
		/*
		 * constructor based injection
		 * where dependency is Mandatory and Immutable
		 */
		Institute kw = new Institute("kodeWala", "java full stack", true, 7000.0,ganesh);
	
		kw.setStudentInfo(ganesh);
	
		Institute tapAcademy = new Institute("TapAcademy", "java full stack", true, 7000.0);
		/*
		 * setter based DI mutable and optional
		 */
		tapAcademy.setStudentInfo(ganesh);
		
		
		Student ashok = new Student("ashok", "1 bhava mudaliyar street, chidambaram", "MERN stack", false);
		
		
		tapAcademy.setStudentInfo(ashok);
		kw.display();
		
		tapAcademy.display();
	}

}
