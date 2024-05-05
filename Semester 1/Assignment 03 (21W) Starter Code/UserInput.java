
import java.util.Scanner;

public class UserInput {
	
	private Scanner scanner = new Scanner(System.in);
	
	public String inputText() {
		return scanner.nextLine();
	}
	
	public double inputDouble() {
		// ToDo: Update this method:
		// If the input is not a double use a loop
		// to prompt the user and request they re-enter
		// the data. See lecture notes.
		double result=0;
		while(scanner.hasNext()) {
			if (scanner.hasNextDouble()) {
				result= scanner.nextDouble();
				break;
			}
			else {
				scanner.nextLine(); // clean up the input stream
				System.out.println("Number entered is not double please enter again");
			}
		}
		//double result= scanner.nextDouble();
		return result;
	}
	
	public int inputInteger() {
		// ToDo: Update this method:
		// If the input is not an int use a loop
		// to prompt the user and request they re-enter
		// the data. See lecture notes.
		
		while(!scanner.hasNextInt()) {
			
			scanner.nextLine(); // clean up the input stream
			System.out.println("Number entered is not integer please enter again");
		}
		int result = scanner.nextInt();
		return result;
	}

}
