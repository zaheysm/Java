import java.util.Scanner;
/**
 * class that represent person in the program for the main features 
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 */

public class Person {

	//private parameters declared to instantiate features of person like first name,last name, email and phone number   
	private String firstName;
	private String lastName;
	private String email;
	private long phoneNumber;
	
	/**
	 * method that gets first name and last name of person
	 * @return full of person
	 */
	public String getFullName() {
		return firstName+" "+lastName;
	}
	
	/**
	 * method that gets email of person
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	
	
	/**
	 * method that returns phone number of person 
	 * @return phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * method that will read the features of person and set them in the variables  
	 * @param scan it's scanner class object that we need to input to the parameters 
	 */
	public void readPersonalDetails(Scanner scan) {
		System.out.print("Enter first name: ");
		firstName=TestInput.testEmptyString(scan);//read first 
		System.out.print("Enter last name: ");
		lastName=TestInput.testEmptyString(scan);//read last name
		System.out.print("Enter email:");
		email=TestInput.testEmptyString(scan);//read email
		System.out.print("Enter phone number: ");
		TestInput.testLong(scan);//method that will check Long is being input
		phoneNumber=scan.nextLong();
		scan.nextLine();// clean up the input stream
	}

	
	

}
