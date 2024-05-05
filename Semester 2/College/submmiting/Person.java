
/**
 * abstract class that hold the fields information of a person
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public abstract class Person {
	
	/**declare private instances to host the main info of person**/
	protected  String firstName;
	protected String lastName;
	protected String emailId;
	protected long phoneNumber;
	
	/**abstract methods that will be used in other method to read info**/
	abstract void readInfo();
	/**abstract methods that will be used in other method to print info**/
	abstract void printInfo();
	
	
}
