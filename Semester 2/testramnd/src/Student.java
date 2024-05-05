

import java.util.Scanner;
public class Student extends person implements Policies {
	
	int StudentNumber;//instance variables
	String programName;
	double GPA;


	@Override
	public void readInfo() {//accepts nothing returns nothing
		Scanner scanner= new Scanner(System.in);//instantiating scanner class
		System.out.print("Enter Program Name ");
		programName= scanner.next();
		System.out.print("Enter Student Number");
		StudentNumber = scanner.nextInt();
		System.out.print("Enter First Name:");
		firstName= scanner.next();
		System.out.print("Enter Last Name:");
		lastName = scanner.next();
		System.out.print("Enter Email id:");
		emailId= scanner.next();
		System.out.print("Enter Phone number:");
		phoneNumber= scanner.nextLong();
		scanner.nextLine();
		

		readMarks(); //method to read marks
		

		
		
	}
	private void readMarks() { //access specifier is private because it is needed to be called from  this class only
		Scanner scanner= new Scanner(System.in);//instantiating scanner class
		System.out.print("Enter number of courses: "); 
		int courses = 0; //instantiating variable 

		courses= scanner.nextInt();
		double[] marks= new double[courses];//double array of marks , number of courses will be size of array
		for (int i=0; i< marks.length; i++){
			System.out.print("Enter marks: "+(i+1)+":");
			marks[i]= scanner.nextDouble();

		}
		
		
		
		
		calculateGPA(marks); //after reading marks and number of courses method will call CalculateGPA() method
		//accepts an array as parameter
	}
	//using all the methods in person class and Policies interface
	@Override
	public void calculateGPA(double [] array) {
		double sum=0;
		double average=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];
			average= sum/array.length;
			
		}
		GPA= (average* maxGPA)/ maxmarks;
		
	}
	

	@Override
	public void printInfo() {
		System.out.printf("%10s|\t%10d|\t%15s|%25s|\t%13d|\t%5.2f|\n",programName, StudentNumber, firstName+" "+lastName, emailId, phoneNumber,GPA );
		
	}
	

}

