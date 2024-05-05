/*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/
/**
 * Represents a Person.
 *
 * @author Chayma Tsouli
 * @version 1.0
 * @since 1.0
 */
public abstract class Person { // abstract class 

    /**
     * Represents the person’s first name.
     */
    protected String firstName;  // instance variable 
    /**
     * Represents the person’s last name.
     */
    protected String lastName;
    /**
     * Represents the person’s email id.
     */
    protected String emailId;
    /**
     * Represents the person’s phone number.
     */
    protected long phoneNumber;

    /**
     * Reade a person information.
     */
    public abstract void readInfo(); // method to read info 

    /**
     * Print a person information.
     */
    public abstract void printInfo(); // method to print info 



}
