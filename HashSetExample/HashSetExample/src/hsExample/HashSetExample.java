package hsExample;

import java.util.HashSet;

/**
 * Example used to explore HashSet features
 * for use in CST8130, Algonquin College
 * @author George Kriger
 *
 */
public class HashSetExample {
  /**
   * main() which exercises features of HashSet class
 * @param args command lines arguments (not used)
 */
public static void main(String[] args) {

    // Create a HashSet object called numbers
    HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    System.out.println(numbers.size());
    for(int i=0; i<16; i++)
    	numbers.add(i); //autobox int to Integer
    
    System.out.println(numbers.size());

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }

  }//main()
}//class
