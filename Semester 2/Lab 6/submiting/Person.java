import java.util.Scanner;

/**
 * Class that read and print the information of person
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public abstract class Person {

    // declare private variables that will be user in this method
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNumber;

    /**
     * method that will read the main person info from keyboard
     * @param scan Scanner class to scan object
     */
    public void readInfo(Scanner scan){
        System.out.print("Enter first name: ");
        firstName=TestInputs.testEmptyString(scan);
        System.out.print("Enter last name: ");
        lastName=TestInputs.testEmptyString(scan);
        System.out.print("Enter email address: ");
        email=TestInputs.testEmptyString(scan);
        System.out.print("Enter phone number :");
        phoneNumber=TestInputs.testLong(scan);
    }

    /**
     * method that will read the main person info from keyboard
     * @param scan Scanner class to scan object
     */
    public void readinfofile(Scanner scan){
        firstName=scan.next();
        lastName=scan.next();
        email=scan.next();
        phoneNumber=scan.nextLong();
    }

    /**
     * abstract class that will be used to print info
     */
    public abstract void printinfo();

    /**
     * method that get full name
     * @return full name
     */
    public String getFullName() {
        return firstName+" "+lastName;
    }

    /**
     * method that get email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * method that will get phone number
     * @return phone number
     */
    public long getPhoneNumber() {
        return phoneNumber;
    }

}
