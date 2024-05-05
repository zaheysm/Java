
import java.util.Scanner;

public class Inputs {
	
	private static Scanner scanner = new Scanner(System.in);
	//return input string
	public static String inputText() {
		return scanner.nextLine();
	}
	//return input double
	public static double inputDouble() {
		while(!scanner.hasNextDouble()) {
				scanner.nextLine(); // clean up the input stream
				System.out.println("Number entered is not double please enter again");
			}
		
		double result= scanner.nextDouble();
		scanner.nextLine(); // clean up the input stream
		return result;
	}
	
	//return input integer
	public static int inputInteger() {
		
		while(!scanner.hasNextInt()) {
			
			scanner.nextLine(); // clean up the input stream
			System.out.println("Number entered is not integer please enter again");
		}
		int result = scanner.nextInt();
		scanner.nextLine(); // clean up the input stream
		return result;
	}
	
	//return input long
	public static long inputLong() {
		
		while(!scanner.hasNextLong()) {
			
			scanner.nextLine(); // clean up the input stream
			System.out.println("Number entered is not integer please enter again");
		}
		long result = scanner.nextLong();
		return result;
	}

}
