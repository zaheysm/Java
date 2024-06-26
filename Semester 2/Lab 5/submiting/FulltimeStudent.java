import java.util.Scanner;


public class FulltimeStudent extends Student {
	/**
	 * declare private instances to host the Tuition Fees
	 */
	protected double tuitionFees;
	
	/**override method that is being read more info into readInfo method added to what been used, using the super key
	 * @param input Scanner class
	 */
	@Override
	public void readInfoKeyboard(Scanner input) {
		super.readInfoKeyboard(input);//call the super class method
		System.out.print("Enter tuition fees: ");
		TestInputs.testDouble(input);
		tuitionFees=input.nextDouble();//uses input class to read double
	}


	/**override method that is being read more info into readInfo method added to what been used, using the super key
	 * @param input Scanner class
	 */
	@Override
	public void readInfoFile(Scanner input) {
		super.readInfoFile(input);//call the super class method
		tuitionFees=input.nextDouble();//uses input class to read double
	}


	/**
	 * override method that is being print more info into printInfo method added to what been used, using the super key
	 */
	@Override
	public void printInfo() {
		super.printInfo();//call the super class method
		System.out.printf("%7.2f|%n",tuitionFees);
	}

}
