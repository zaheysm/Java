
import java.util.InputMismatchException;
import java.util.Scanner;

 /**
 * This class contains the dynamically allocated array and it's processing
 * Student Name:
 * Student Number:
 * Course: CST8130 - Data Structures
 * CET-CS-Level 3
 * @author/Professor James Mwangi PhD.
 *
 */
public class Numbers {

    /**
     * Stores Float values.
     */
    private Float[] numbers;


    /**
     * Store the number of items currently in the array.
     */
    private int size;

    private int numItems;


    private Scanner input;

    /**
     * Default Constructor
     */

    public Numbers() {
        // TODO Write code here to initialize a "default" array since this is the default constructor
        numItems=0;
        numbers = new Float[10];

    }

    /**
     * Constructor that initializes the numbers array.
     *
     * @param size - Max size of the numbers array
     */
    public Numbers(int size) {
        // TODO Write code here to initialize the numbers array of max 'size'
        numItems=0;
        numbers = new Float[size];

    }

    /**
     * Adds a value in the array
     *
     * @param keyboard - Scanner object to use for input
     */
    public void addValue(Scanner scan) {
        //float[] array = new float[size];
        if (numbers.length == numItems) {//displays message if the length of array is equal to entered size
            System.out.println("Array is full!");
        } else {
            System.out.print("Enter value: ");//accepts user input for individual elements of array
            if (scan.hasNextFloat()) {
                //scan = null;
                numbers[numItems] = scan.nextFloat();
                System.out.println("Element has been added!");//alerts user with addition
           } else {
               throw new InputMismatchException();//detects string input
           }
            numItems++;//increases size of array for dynamic expansion if needed
            scan.nextLine();//clears input buffer
        }
    }

    public void printArray() {
        if (numItems == 0) {
            System.out.println("Numbers are: ");
        } else {
            System.out.println("Numbers are: ");
            for (int i = 0; i < numItems; i++) {
                System.out.println(toString(numbers[i]));
            }

        }
    }

    /**
     * Calculates the average of all the values in the numbers array.
     *
     * @return float value that represents the average
     */
    public String findMaxMin() {
        float maximum = numbers[0];
        float minimum = numbers[0];

        // iterate and compare from array index 1
        for (int i = 1; i <  numItems; i++) {
            if (maximum < numbers[i]) {
                maximum = numbers[i];
            } else if (minimum > numbers[i]) {
                minimum = numbers[i];
            }
        }
        return " Maximum Value: " + maximum + " Minimum Value: " + minimum;
    }

    public float calcAverage() {
        //float[] array = new float[size];
        float sum = 0;

        // sum of all values in array using for loop
        for (int i=0;i<numItems;i++) {
            sum += numbers[i];
        }

        if (numItems == 0) {
            return 0;
        }

        return sum / numItems;
    }

    public String toString(float numbers) {
        // TODO Write code for an appropriate toString method

        return String.format("%.2f", numbers);

    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        if (numbers[0]==null){
            return true;
        }else {
            return false;
        }
    }


}


