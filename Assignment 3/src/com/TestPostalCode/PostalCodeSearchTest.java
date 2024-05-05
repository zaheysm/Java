package com.TestPostalCode;

import com.PostalCodeEntery.PostalCodeEntry;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

/**
 * Starter file for Assigment3 for CST8130-Fall2021
 * @author George Kriger
 * @author Zahi Masarwa
 */

public class PostalCodeSearchTest {

	/**
	 * main() which opens and read CSV file of Canadian postal codes
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		PostalCodeEntry postalCode;		//declare class postalcodeentry
		HashMap <String,PostalCodeEntry> postalCodeList = new HashMap<>();		//declare and instantiate HashMap
		String filename = "ottawa_postal_codes.csv";		//the file name to read
		Path file = Paths.get(filename);		//read the path of the file
		try (BufferedReader input = Files.newBufferedReader(file)) {		//try to read the buffer
			String line = null;		//declare line for the file
			String fields[];		//declare string array to input file content
			while ((line = input.readLine()) != null) {		//loop while file has lines
				//System.out.println(line);
				fields = line.split(",");		//split each line of the file separated by comma
				postalCode=new PostalCodeEntry(fields);		//instantiate class postal code entry using constructor to take an array
				postalCodeList.put(postalCode.getPrefix(),postalCode);		//add the fields to hashmap tree and make the prefix as a key


			}//while
		}
		catch (IOException ioException) {		//catch statement
			System.err.println("Error opening file");		//print error
			ioException.printStackTrace();		//print stack trace

		}
		for (int i=0;i<10;i++){		//loop 10 times
			String po;		//declare string to hold prefix
			po= PostalCodeEntry.getRandomPrefix();		//generate random prefix using static method from class com.PostalCodeEntery.PostalCodeEntry
			System.out.println("Retrieving: "+po);		//print the result

			if (postalCodeList.containsKey(po)){		//check if  the list contain the prefix
				System.out.println(postalCodeList.get(po));		//print the prefix found by key
			}else {
				System.out.println("Not Found");		//print not found if the prefix not found
			}

		}
		// no need to close input. Used try-with-resources above
	}// main()

}// class
