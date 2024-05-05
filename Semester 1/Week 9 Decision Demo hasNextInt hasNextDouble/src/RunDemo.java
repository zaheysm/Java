/*
 * Author: Stanley Pieda
 * Date: Oct 31, 2020
 * Description: Demonstration of using class Scanner methods hasNextInt(),
 * hasNextDouble()
 */

import java.util.Scanner;

/*
 * Demo program
 */
public class RunDemo {

	/*
	 * Entry point for application
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int number1 = 0;
		double number2 = 0;
		
		// Validate integer input example.
		System.out.println("Please enter an integer");
		if(keyboard.hasNextInt()) {
			number1 = keyboard.nextInt();
			System.out.println("you entered: " + number1);
		}
		else {
			System.out.println("invalid input");
			keyboard.nextLine(); // discard the bad input!
		}
		
		// Validate double input example.
		System.out.println("Please enter a double");
		if(keyboard.hasNextDouble()) {
			number2 = keyboard.nextDouble();
			//System.out.println(keyboard.hasNextDouble());
			System.out.println("you entered: " + number2);
		}
		else {
			System.out.println("invalid input");
			keyboard.nextLine(); // discard the bad input!
		}
		
		
	}

}
