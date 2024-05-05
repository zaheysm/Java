

import java.util.Scanner;


public class CollegeSystemTest {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter name of College:");
		 String collegeName= scanner.nextLine();
		 System.out.println("Enter number of students:");
		int n= scanner.nextInt();
		
		College c1 = new College(collegeName, n);
		c1.readStudentDetails();
		c1.printTitle(collegeName);
		c1.printStudentDetails();
		scanner.close();

	}

}
