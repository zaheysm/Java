import java.util.Scanner;

public class InputUser {
	
	private Scanner scanner = new Scanner(System.in);
	
	//method input double
	public double inputDouble() {
		while(!scanner.hasNextDouble()) {
				scanner.nextLine(); // clean up the input stream
				System.out.println("Number entered is not double please enter again");
			}
		
		double result= scanner.nextDouble();
		scanner.nextLine(); // clean up the input stream
		return result;
	}
	
	//method to input integer
	public int inputInteger() {
	
		
		while(!scanner.hasNextInt()) {
			
			scanner.nextLine(); // clean up the input stream
			System.out.println("Number entered is not integer please enter again");
		}
		int result = scanner.nextInt();
		scanner.nextLine(); // clean up the input stream
		return result;
	}
	
	public String inputText() {
		return scanner.nextLine();
	}

}
