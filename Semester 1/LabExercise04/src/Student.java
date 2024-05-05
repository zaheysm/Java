public class Student {
	
	private String FirstName;
	private String LastName;
	private String StudentNumber;
	private double GradePointAverage;
	
	//constructor 
	public Student(){
		
	}
	public Student(String FirstName,String LastName,String StudentNumber,double GradePointAverage){
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.StudentNumber=StudentNumber;
		this.GradePointAverage=GradePointAverage;
	}
	// Getter
	public String getFirstName() {
		
		return FirstName;
	}
	
	public String getLastName() {
		
		return LastName;
	}
	
	public String getStudentNumber() {
		
		return StudentNumber;
	}
	
	public double getGradePointAverage() {
		
		return GradePointAverage;
	}
	
	//setter
	public void setStudent(String newFirstName,String newLastName,String newStudentNumber,double newAge) {
		this.FirstName=newFirstName;
		this.LastName=newLastName;
		this.StudentNumber=newStudentNumber;
		this.GradePointAverage=newAge;
	}
	
	//worker method
	public void printstudent() {
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(StudentNumber);
		System.out.println(GradePointAverage);
		System.out.println(FirstName+" "+LastName+" "+" "+StudentNumber+" "+GradePointAverage);
	}
	

}
