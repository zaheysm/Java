import java.util.Scanner;

/*
	 * Assessment: Exercise 02 
	 * Student Name:Zahi Masarwa
	 * Due Date: 02/07/21
	 * Description: A simple program to output a name and the date and time. 
	 * Professor Name:Mel Sanschagrin 
	*/

import java.util.Scanner;
import java.lang.Math;

public class Calculate {
	
	public static void main(String[] args) {
		double x,y,z,sum,squareroot,power1on2,power2on3,power3on1,avrage;
		Scanner Keyboard= new Scanner(System.in);
		System.out.println("Program to run Math equation");
		System.out.println("Please Enter First number between 1-10:");
		x=Keyboard.nextDouble();
		System.out.println("Please Enter Second number between 1-10:");
		y=Keyboard.nextDouble();
		System.out.println("Please Enter Third number between 1-10:");
		z=Keyboard.nextDouble();
		Keyboard.close();
		sum=x+y+z;
		avrage=sum/3;
		squareroot=Math.sqrt(sum);
		power1on2=Math.pow(x, y);
		power2on3=Math.pow(y, z);
		power3on1=Math.pow(z, x);
		System.out.println("first number is:"+x+", second number is:"+y+" ,third number is:"+z);
		System.out.println("The sum of numbers enterned"+sum+"\n");
		System.out.println("The Average  of the three numbers is:"+avrage);
		System.out.println("The Square root of the three number is:"+squareroot);
		System.out.println(x+" to the power of "+y+"is: "+power1on2);
		System.out.println(y+" to the power of "+z+"is: "+power2on3);
		System.out.println(z+" to the power of "+x+"is: "+power3on1);
		System.out.println("My Full Name is: Zahi Masarwa");
		
		
		
		
		
	}

}
