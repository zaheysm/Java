import java.util.Scanner;
/**
 * class that will test input that is correct 
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 *
 */
public class TestInput {
	/**
	 * method that will test if input double 
	 * @param scan Scanner parameter 
	 */
	public static void testDouble(Scanner scan) {
		while(!scan.hasNextDouble()) {
			scan.nextLine(); // clean up the input stream
				System.out.println("Number entered is not double please enter again");
			}
	}
	
	/**
	 * method that will test if input integer 
	 * @param scan Scanner parameter 
	 */
	public static void testInt(Scanner scan) {
		while(!scan.hasNextInt()) {
			scan.nextLine(); // clean up the input stream
				System.out.println("Number entered is not Integer please enter again");
			}
	}
	
	/**
	 * method that will test if input long 
	 * @param scan Scanner parameter 
	 */
	public static void testLong(Scanner scan) {
		while(!scan.hasNextLong()) {
			scan.nextLine(); // clean up the input stream
				System.out.println("Number entered is not double please enter again");
			}
	}
	
	/**
	 * method that will test if input string is not empty if it's will give an error to replace with not empty one 
	 * @param scan Scanner parameter 
	 * @return return string that is not empty 
	 */
	public static String testEmptyString(Scanner scan) {
		String str=scan.nextLine();
		while (str.isEmpty()) {
			System.out.println("The you left the batch empyty please fix it ");
			str=scan.nextLine();
		}
		return str;
	}
	

}
