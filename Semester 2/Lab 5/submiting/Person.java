import java.util.Scanner;

public abstract class Person {
	
	/**declare private instances to host the First Name**/
	protected  String firstName;
	/**declare private instances to host the Last Name**/
	protected String lastName;
	/**declare private instances to host the Email**/
	protected String emailId;
	/**declare private instances to host the Phone Number**/
	protected long phoneNumber;
	
	/**abstract methods that will be used in other method to read info from keyboards
	 * @param input scanner class
	 * */
	abstract void readInfoKeyboard(Scanner input);

	/**abstract methods that will be used in other method to read info from file
	 * @param input scanner class
	 * */
	abstract  void readInfoFile(Scanner input);

	/**abstract methods that will be used in other method to print info**/
	abstract void printInfo();
	
	
}
