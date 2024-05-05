
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * class that is being used to input the information that is being read by the user and checks if it a valid info
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 **/
public class TestInputs {
    /**
     * method that will test if input string is not empty if it's will give an error to replace with not empty one
     * @param scan Scanner parameter
     * @return return string that is not empty
     */
    public static String testEmptyString(Scanner scan) {
        String str = scan.nextLine();
        while (str.isEmpty()) {
            System.err.println("you left it empty please write something");
            str = scan.next();
            scan.nextLine();//clear stream input
        }
        return str;
    }

    /**
     * method that will test if input integer or is zero or under and return the result
     * @param scan Scanner parameter
     * @param message the statement print for the user
     * @return integer
     */
    public static int inputInteger(Scanner scan,String message) {
        boolean b=true;     //declare boolean
        do{     //do while loop
        try {       //try statement
            System.out.print(message);      //print the message sent to the method
            int result = scan.nextInt();        //input integer
            if (result < 0) {       //test if result is negative
                throw new IllegalAccessException("Number Must be Positive");        //throw exception with error message
            }
            scan.nextLine();        // clean up the input stream
            return result;      //return the result
        }catch (IllegalAccessException e){      //Exception handling statement
            System.err.println(e.getMessage());     //print error message
            scan.nextLine(); // clean up the input stream
        }catch (InputMismatchException e){      //Exception handling statement
            System.err.println("Number entered is not integer please enter again");      //print error message
            scan.nextLine(); // clean up the input stream
        }
        }while (b);     //loop condition
        return -1;      //return -1
    }
    /**
     * method that will test if input float or is zero or under and return the result
     * @param scan Scanner parameter
     * @param message the statement print for the user
     * @return float
     */
    public static float testFloat(Scanner scan,String message) {
        do {        //do while loop
            try {       //try statement
                System.out.print(message);      //print the message sent to the method
                float result = scan.nextFloat();         //input integer
                if (result < 0) {       //test if result is negative
                    throw new IllegalAccessException("Number Must be Positive");        //throw exception with error message
                }
                scan.nextLine(); // clean up the input stream
                return result;      //return the result
            } catch (IllegalAccessException e) {        //Exception handling statement
                System.out.println(e.getMessage());     //print error message
                scan.nextLine(); // clean up the input stream
            }catch (InputMismatchException e){          //Exception handling statement
                System.err.println("Number entered is not float please enter again");       //print error message
                scan.nextLine(); // clean up the input stream
            }
        }while (true);  //loop condition

    }

}
