package com.Main.TestClass;

import com.HashTable.Set.HashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;

/**
 * Starter file for Lab6 for CST8130-Fall2021
 * @author George Kriger
 * @author Zahi Masarwa
 */

public class PostalCodeSearchTest {

	/**
	 * main() which opens and read CSV file of Canadian postal codes
	 * @param args command line arguments (not used)
	 */
	public static  void main(String[] args) {
		HashTable<String> hash=new HashTable<String>();		//declare and initialize class hashtable
		String filename = "ottawa_postal_codes_prefix_only.csv";		//filename
		Path file = Paths.get(filename);		//read file path
		try (BufferedReader input = Files.newBufferedReader(file)) {		//try to read file content
			String line = null;		//declare empty string
			while ((line = input.readLine()) != null) {		//loop on the file lines
				hash.add(line);		//add the line to the hashtable
			}//while
		}
		catch (IOException ioException) {		//catch the error
			System.err.println("Error opening file");
			ioException.printStackTrace();

		} 
		// no need to close input. Used try-with-resources above

		System.out.println("\nGenerating random prefixes");
		
		for(int i=0; i<10; i++) {		//loop to generate random prefix
			String key=getRandomPrefix();		//get random from method
			System.out.printf("Retrieving: %s ",key) ;		//printing the random prefix
			if (hash.search(key)){		//search for the key from hashtable
				System.out.println("found");		//print found
			}else{
				System.out.println("Not found");		//print not found
			}
		}
	}// main()

	// create random generator once. To be used for the life of main(). Global
	// visibility
	// provide a seed value to get same random sequence
	// remove seed after testing
//	final static SecureRandom rand = new SecureRandom("abcdefghijklmnop".getBytes());
	
	final static SecureRandom rand = new SecureRandom();
	final static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static String number = "0123456789";

	/**
	 * randomly generate a prefix using the correct format for Canadian postal codes
	 * 
	 * @return randomly generated prefix of the postal code
	 */
	public static String getRandomPrefix() {
		int randA = rand.nextInt(alpha.length());
		int randN = rand.nextInt(number.length());

		return "K" + number.charAt(randN) + alpha.charAt(randA);
	}// getRandomPrefix()

}// class
