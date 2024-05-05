import java.util.InputMismatchException;
import java.util.Scanner;

public class Numbers {
	/**
	 * Stores Float values.
	 */
	private Float [] numbers;
	
	/**
	 * Store the number of items currently in the array.
	 */
	private int numItems=0;

	/**
	 * Default Constructor
	 */
	public Numbers() {
		// TODO Write code here to initialize a "default" array since this is the default constructor
		numbers=new Float[10];//initialize array to size ten
	}

	/**
	 * Constructor that initializes the numbers array.
	 * @param size - Max size of the numbers array
	 */
	public Numbers(int size) {
		// TODO Write code here to initialize the numbers array of max 'size'
		numItems=0;//rest the number of items to zero
		numbers=new Float[size];//initialize array to size of variable size
	}
	
	/**
	 * Adds a value in the array
	 * @param keyboard - Scanner object to use for input
	 */
	public void addValue(Scanner keyboard) {
		// TODO Write code here to add the values in the array
		if (numbers.length==numItems){//statement to test if the array reached the limit
			System.out.println("Array full");//print the array is full
		}else {
			System.out.print("Enter value: ");//print statement to enter value
			if (keyboard.hasNextFloat()) {
				numbers[numItems] = keyboard.nextFloat();//use scanner to scan float variable
			}
			else{
				throw new InputMismatchException();
			}
			numItems++;//increase the item numbers
			keyboard.nextLine();
		}
	}
	
	/**
	 * Calculates the average of all the values in the numbers array.
	 * @return float value that represents the average
	 */
	public float calcAverage() {
		// TODO Write code to return the average of the values in the array
		float result=0,sum=0;//variables to calculate the average
		if (numbers[0]!= null) {//test if the array is empty
			for (int i=0;i<numItems;i++) {//loop on the array
				sum = sum + numbers[i];//sum the numbers of the array
			}
			result = sum / numItems;//calculate teh average
		}
		return (float) result;//return the average
	}

	/**
	 * method that will calculate the max and min numbers in the array
	 * @return array with the max and min numbers inside it
	 */
	public float [] findMinMax(){
		float max,min;//declare variable for max and min
		if (numbers[0]!= null) {//test if the array is empty
			max = Float.MIN_NORMAL;//instantiate the variable for the min available for float
			min = Float.MAX_VALUE;//instantiate the variable for the max available for float

			for (int i=0;i<numItems;i++) {//loop on the array
				if (numbers[i] < min) {//test if the number in the array smaller than min
					min = numbers[i];
				}
				if (numbers[i] > max) {//test if the number in the array bigger than max
					max = numbers[i];
				}
			}
		}
		else {
			max=0;//instantiate the variable to zero
			min=0;//instantiate the variable to zero
		}
		return new float[]{max,min};//return array of floats contains max and min
	}

	/**
	 * override tostring method to convert the array to string
	 * @return string line og the array
	 */
	@Override
	public String toString() {
		// TODO Write code for an appropriate toString method
		String str = "Numbers are:";
		if (numbers[0]!= null) {
			for (int i=0;i<numItems;i++) {
				str = str + "\n" + numbers[i];
			}
		}

		return str;
	}

	/**
	 * method that will test if input string is not empty if it's will give an error to replace with not empty one
	 * @param scan Scanner parameter
	 * @exception IllegalAccessException throws exception if inout is empty
	 * @return return string that is not empty
	 */
	public static String testEmptyString(Scanner scan) throws IllegalAccessException {
		String str = scan.nextLine();
		if (str.isEmpty()){
			throw new IllegalAccessException();
		}
		return str;
	}
	
}
