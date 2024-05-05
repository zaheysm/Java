/*
 * Author: Stanley Pieda
 * Date: Nov 4, 2020
 * Description: Demonstration of switch with constants
 */

import java.util.Scanner;

/*
 * Demonstrates conditional operator, with 
 * comparison to equivalent if structure.
 */
public class ConditionalOperatorDemo {

	/*
	 * Entry point for the application
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String result = null;
		int number = 0;
		
		System.out.println("Please enter an integer number");
		number = keyboard.nextInt();
		
		
		// Selection Structure, Nested If
		if(number < 10){
		     result = "less than";
		} 
		else if(number > 10){
		    result = "greater than";
		}
		else{
		    result = "equal to";
		}
		System.out.println("Input value is " + result + " 10");

		
		// Conditional Operator, Nested
		result = (number < 10) ? "less than" : (number > 10) ? "greater than" : "equal to";
		System.out.println("Input value is " + result + " 10");

	}

}
