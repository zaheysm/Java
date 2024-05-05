/**
 * 
 */
package sExamplePkg;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.util.TreeSet;

/**
 * Example that uses a CSV file and a Set
 * @author George Kriger
 *
 */
public class UseFileWithSet {

	/**
	 * This example reads a CSV file, breaks each line into fields One of fields is
	 * added to a Set. Then the Set is tested with random values
	 * main() does all of the work 
	 *
	 * @param args command line args (not used
	 */
	public static void main(String[] args) {
	
		String filename = "ComputerEngineering.0006X01FWO.csv";
		Path file = Paths.get(filename);
	    TreeSet<String> courseList = new TreeSet<>();
	    
		try (BufferedReader input = Files.newBufferedReader(file)) {
		    String line = null;
		    String fields[];
 
		    while ((line = input.readLine()) != null) {
			    fields = line.split(",");
			    courseList.add(fields[0]);
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		//no need to close input. Used try-with-resources above
		
		for(int i=0; i<5; i++) {
			String code = randomCourse();
			System.out.printf("%s %s\n", code, courseList.contains(code)? " found":" INvalid course#");
		}
		
		//test with valid courses
		String[] validCourses = {"CST8132", "CST8130", "CST8216", "CST8234", "CST8238"};
		
		for(String s:validCourses)
			System.out.printf("%s %s\n", s, courseList.contains(s)? " found":" INvalid course#");
		
	}//main()
	
	//create random generator once. To be used for the life of main(). Global visibility
	// provide a seed value to get same random sequence
	// remove seed after testing
	final static SecureRandom rand = new SecureRandom("abcdefghijklmnop".getBytes());
	
	/**
	 * generates random course: 3 alpha followed by 4 numeric. Alpha are upper case
	 * @return random course code
	 */
	
	// randomCOurse() is static b/c this gets called from main() which is static
	public static String randomCourse() {  

		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String number = "0123456789";
		StringBuilder tempSB = new StringBuilder();

		for(int i=0; i<3; i++)
			tempSB.append(alpha.charAt(rand.nextInt(alpha.length())));

		for(int i=0; i<4; i++)
			tempSB.append(number.charAt(rand.nextInt(number.length())));
		
		return tempSB.toString();
	}// randomCourse()
	
}//class
