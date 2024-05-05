
import java.util.Scanner;

public class College {//concrete class
	String collegeName;
	Student[] students; //array of student class
	
	College(String collegeName, int numStudents){//creating parameterized constructor
		this.collegeName= collegeName;
		students= new Student[numStudents];//initializing a value for array by using numStudents parameter and it is the size of array
		
	}
	public void readStudentDetails() {// constructor that accepts nothing returns nothing
		for(int i=0; i<students.length;i++)//using for loop to loop through an array
		{//start of for loop
		Scanner input = new Scanner (System.in);//instantiating scanner class
		int choice;
		System.out.print("Enter details of Student" +(i+1) +":");//i+1 so that loop doesnot start with i=0
		System.out.print("1. Full Time Student \n 2. Part Time Student \n ");//print statements in separate lines using \n
		System.out.print("Enter Student type: ");
		choice= input.nextInt();//to take integer input from user and store it in choice variable
		switch (choice) { //using switch for the different values of choice
		case 1:
		students[i] = new FullTimeStudent();	//instantiating an from class FullTimeStudent
		students[i].readInfo();
		break;
		case 2:
			students[i]= new PartTimeStudent();
			students[i].readInfo();
			break;
			default://if user enter non integer or different value from options
				System.out.print("Wrong Student Type, Enter Again");
		}
		
		
		input.close();//end of scanner class
		}//end of for loop
	}
	public void printStudentDetails()
	{
		for (Student student : students){//enhanced for loop with Student as data type of array
			student.printInfo();
		}
		
	}
	
	
	
	public void printTitle(String collegeName) {
	System.out.printf("\t\t\t\t\ts -List of Students\t\t\t\t\t\n", collegeName);
	System.out.println("************************************");
	System.out.printf("Program | Student # | Name | Email | Phone | GPA | Fees | Credits\n");
	
		
	}

}

