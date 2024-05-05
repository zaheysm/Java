import java.util.Scanner;

/*
	 * Assessment: Exercise 04
	 * Student Name:Zahi Masarwa
	 * Due Date: 02/12/21
	 * Description: Simple Program that set class person full name and age  
	 * Professor Name:Mel Sanschagrin 
	*/



public class Exercise04 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter First Name");
		String FirstName=scan.next();
		System.out.println("Please enter Last Name");
		String LastName=scan.next();
		System.out.println("Please enter student number");
		String StudentNumber=scan.next();
		System.out.println("Enter your grade point average");
		double GradePointAverage=scan.nextDouble();
		
		Student enterstudent= new Student();
		Student enterstudent1= new Student(FirstName,LastName,StudentNumber,GradePointAverage);
		
		System.out.println("\nTesting methods, default constructor");
		enterstudent1.printstudent();
		
		System.out.println("\nTesting overloaded constructor");
		enterstudent.setStudent(FirstName, LastName, StudentNumber,GradePointAverage);
		enterstudent.printstudent();
		
		scan.close();
		
	}

}
