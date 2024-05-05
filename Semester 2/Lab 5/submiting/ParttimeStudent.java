import java.util.Scanner;

public class ParttimeStudent extends Student{

	/**
	 * declare private instances to host the Course Fees Total
	 */
	protected double courseFeesTotal;
	/**
	 * declare private instances to host the Credits
	 */
	protected double credits;
	
	/** override method that is being read more info into readInfo method added to what been used, using the super key
	 * @param input scanner class
	  **/
	@Override
	public void readInfoKeyboard(Scanner input) {
		super.readInfoKeyboard(input);//call the super class method
		//checks is the input from file
		System.out.print("Enter total course fees: ");
		TestInputs.testDouble(input);
		courseFeesTotal=input.nextDouble();//uses input class to read double
		System.out.print("Enter credit hours: ");
		TestInputs.testDouble(input);
		credits=input.nextDouble();//uses input class to read double

	}

	/** override method that is being read more info into readInfo method added to what been used, using the super key
	 * @param input scanner class
	 **/
	@Override
	public void readInfoFile(Scanner input) {
		super.readInfoFile(input);
		courseFeesTotal=input.nextDouble();//uses input class to read double
		credits=input.nextDouble();//uses input class to read double
	}
	
	/**override method that is being print more info into printInfo method added to what been used, using the super key**/
	@Override
	public void printInfo() {
		super.printInfo();//call the super class method
		System.out.printf("%7.2f|%10.2f|%n",courseFeesTotal,credits);
	}

}
