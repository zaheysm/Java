import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This class contains the menu that preforms to generate and random array and populate and calculate time taken to find a number also calculate sorting time in different class
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class TestSearchSort {
    /**
     * Main method that call and calculate the time needed to find number in randomised array
     * @param args the main method to run the project
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        BinaryLinearSearch search=new BinaryLinearSearch();     //instantiate class BinaryLinearSearch
        int [] randarr=new int[1000];     //declare an array to hold the random array from the class
        int key=0;      //declare int key to for the search
        long startNano;     //declare start time for nano
        long startMillis;       //declare start time for millis
        long estimateTimeNano;      //declare estimate time in nano
        long estimateTimemMllis;        //declare estimate time in millis
        int choice=0;       //declare choice for switch
        int index; //declare int
        do{// do while statement
            try {//try statement to detcetct errors
                System.out.print("Select your option in the menu:\n" +
                        "1.Initialize and populate an array of 1000 random integers.\n" +
                        "2.Perform recursive binary and linear search.\n" +
                        "3.Perform iterative binary and linear search.\n" +
                        "4: Sort the array\n"+
                        "5.Exit.\n");   //print menu
                choice = Integer.parseInt(BinaryLinearSearch.readInput(scan)); //input integer from BinaryLinearSearch class
                switch (choice) {   //switch statement for what the user choose
                    case 1:

                        randarr = search.generateRandomInts();  // run the method and return integer randomise array sorted
                        break;
                    case 2:
                        if (randarr[0] == 0) {
                            throw new NullPointerException();
                        }
                        System.out.println("Please enter an integer value to search: ");    //print statement to the user
                        key = Integer.parseInt(BinaryLinearSearch.readInput(scan));     //input integer from BinaryLinearSearch class
                        int [] tempArr= new int[1000];
                        System.arraycopy(randarr, 0, tempArr, 0, tempArr.length);
                        Arrays.sort(tempArr);
                        BinaryLinearSearch.remainingElements(tempArr,0,tempArr.length);
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //return time in miilis and instantiate into startMillis
                        index = search.recursiveBinarySearch(key, tempArr, 0, randarr.length);      //search for the key in using class BinaryLinearSearch
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        if (index != -1) {      //statment if the result is not -1
                            System.out.printf("%d was found at index position %d:  recursive Binary Search\n", key, index);  //print the result of the search
                        } else {
                            System.out.printf("%d was not found : recursive Binary Search\n", key);  //print that there no key found
                        }
                        System.out.println("Time taken in nanoseconds:" + estimateTimeNano);        //print the result for how long to nano
                        System.out.println("Time taken in milliseconds: " + estimateTimemMllis);        //print the result for how long to millis
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //return time in nano and instantiate into startNano
                        index = search.recursiveLinearSearch(key, tempArr, randarr.length);     //return time in miilis and instantiate into startMillis
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;      //calculate the time take tp run the method in millis
                        if (index != -1) {      //statment if the result is not -1
                            System.out.printf("%d was found at index position %d:  recursive Linear Search\n", key, index);   // print the result of the search
                        } else {
                            System.out.printf("%d was not found : recursive Linear Search\n", key);     //print that there no key found
                        }
                        System.out.println("Time taken in nanoseconds:" + estimateTimeNano);        //print the result for how long to nano
                        System.out.println("Time taken in milliseconds: " + estimateTimemMllis);        //print the result for how long to millis
                        break;
                    case 3:
                        if (randarr[0] == 0) {
                            throw new NullPointerException();
                        }
                        System.out.println("Please enter an integer value to search: ");         //print statement to the user
                        key = Integer.parseInt(BinaryLinearSearch.readInput(scan));         //input integer from BinaryLinearSearch class
                        int [] tempArr1= new int[1000];
                        System.arraycopy(randarr, 0, tempArr1, 0, tempArr1.length);
                        Arrays.sort(tempArr1);
                        BinaryLinearSearch.remainingElements(tempArr1,0,tempArr1.length);
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //return time in miilis and instantiate into startMillis
                        index = search.iterativeBinarySearch(key, tempArr1);     //search for the key in using class BinaryLinearSearch
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        if (index != -1) {        //statment if the result is not -1
                            System.out.printf("%d was found at index position %d:   Iterative Binary Search\n", key, index);        // print the result of the search
                        } else {
                            System.out.printf("%d was not found : Iterative Binary Search\n", key);     //print that there no key found
                        }
                        System.out.println("Time taken in nanoseconds:" + estimateTimeNano);        //print the result for how long to nano
                        System.out.println("Time taken in milliseconds: " + estimateTimemMllis);         //print the result for how long to millis
                        startNano = BinaryLinearSearch.nanoTime();       //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();        //return time in miilis and instantiate into startMillis
                        index = search.iterativeLinearSearch(key, tempArr1);     //search for the key in using class BinaryLinearSearch
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;        //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;      //calculate the time take tp run the method in millis
                        if (index != -1) {      //statment if the result is not -1
                            System.out.printf("%d was found at index position %d:  Iterative Linear Search\n", key, index);     // print the result of the search
                        } else {
                            System.out.printf("%d was not found : recursive Linear Search\n", key);     //print that there no key found
                        }
                        System.out.println("Time taken in nanoseconds:" + estimateTimeNano);        //print the result for how long to nano
                        System.out.println("Time taken in milliseconds: " + estimateTimemMllis);        //print the result for how long to millis
                        break;
                    case 4:
                        SortingAlgorithms sort=new SortingAlgorithms();
                        sort.select(scan,randarr);

                        break;
                    case 5:
                        System.out.println("exiting...");      //print exiting
                        break;
                    default:
                        System.err.println("Please choose the option 1 to 4.");     //print an error when inout is worng

                }
            }catch (InputMismatchException e){      //catch input miss match statement
                System.err.println("*****Input Mismatch Exception*****");       //print statement
            }catch (NullPointerException e){        //catch if the array is empty
                System.err.println("The array has yet to be initialized...Please initialize by clicking 1");    //print statement       //print error statement for suer when he tries to run on empty array
            }catch (NumberFormatException e){
                System.err.println("*****Input Mismatch Exception*****");       //print statement
            }
        }while(choice!=5);  //exit the loop when choose 4


    }
}
