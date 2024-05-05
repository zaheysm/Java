
import java.util.Scanner;

/**
 * class that is being used to input the information that is being read by the user and checks if it a valid info
 * @author Zahi Masarwa
 * @version 1.1
 * @since 15.6
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
     * method that will test if input double
     * @param scan Scanner parameter
     * @return double
     */
    public static double testDouble(Scanner scan) {
        while (!scan.hasNextDouble()) {
            scan.nextLine(); // clean up the input stream
            System.err.println("Number entered is not double please enter again");
        }
        double result = scan.nextDouble();
        scan.nextLine(); // clean up the input stream
        return result;
    }

    /**
     * method that will test if input integer or is zero or under and return the result
     * @param scan Scanner parameter
     * @return integer
     */
    public static int inputInteger(Scanner scan) {
        while (!scan.hasNextInt()){
            scan.nextLine(); // clean up the input stream
            System.err.println("Number entered is not integer please enter again");
        }
        int result = scan.nextInt();
        scan.nextLine(); // clean up the input stream
        return result;
    }

    /**
     * method that will test if input long
     * @param scan Scanner parameter
     * @return long
     */
	public static long testLong(Scanner scan) {

        while(!scan.hasNextLong()) {
            scan.nextLine(); // clean up the input stream
            System.err.println("Number entered is not long please enter again");
        }
        long result = scan.nextLong();
        scan.nextLine(); // clean up the input stream
        return result;
	}

}
