package stackTest;

import stackArray.Stack; //change to switch between array and LL version

/**
 * class to hold method that demos stack operations.
 * @author George Kriger
 *
 */
public class stackTest {

	/**
	 * simple main() to demo stack operations
	 * @param args command line arguments - ignored
	 */
	public static void main(String[] args) {
		Stack<String> a = new Stack<>();
		a.push("d");
		a.push("h");
		a.pop();
		a.push("f");
		a.push("s");
		a.pop();
		a.push("m");
	
		
	}//main

}//class