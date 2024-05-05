
import java.util.Scanner;
/*
	 * Assessment: Exercise 03
	 * Student Name:Zahi Masarwa
	 * Due Date: 02/05/21
	 * Description: A simple program to output text in upper case and the length of the charchter. 
	 * Professor Name:Mel Sanschagrin 
	*/


public class Exercise03 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please Enter you full name");
		String name=scan.nextLine();
		System.out.println("The length of your name is:"+name.length());
		System.out.println("The Name to Uppercase:"+name.toUpperCase());
		System.out.println("Programed By:"+name);
		scan.close();
		
		
	}

}
