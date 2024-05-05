import java.util.InputMismatchException;

/**
 * CET - CS Academic Level 3
 * This class contains the menu that preforms to generate and random array and populate and calculate time taken to find a number
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class Lab2BinLinSearchTest {
    /**
     * Main method that call and calculate the time needed to find number in randomised array
     * @param args the main method to run the project
     */
    public static void main(String[] args) {

        BinaryLinearSearch search=new BinaryLinearSearch();     //instantiate class BinaryLinearSearch
        int [] randarr=new int[30];     //declare an array to hold the random array from the class
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
                        "1.Initialize and populate an array of 30 random integers.\n" +
                        "2.Perform recursive binary and linear search.\n" +
                        "3.Perform iterative binary and linear search.\n" +
                        "4.Exit.\n");   //print menu
                choice = Integer.parseInt(search.readInout()); //input integer from BinaryLinearSearch class
                switch (choice) {   //switch statement for what the user choose
                    case 1:

                        randarr = search.generateRandomInts();  // run the method and return integer randomise array sorted
                        break;
                    case 2:
                        if (randarr[0]==0) {
                            throw new NullPointerException();
                        }
                        System.out.println("Please enter an integer value to search: ");    //print statement to the user
                        key = Integer.parseInt(search.readInout());     //input integer from BinaryLinearSearch class
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //return time in miilis and instantiate into startMillis
                        index = search.recursiveBinarySearch(key, randarr, 0, 30);      //search for the key in using class BinaryLinearSearch
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
                        index = search.recursiveLinearSearch(key, randarr, randarr.length);     //return time in miilis and instantiate into startMillis
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
                        if (randarr[0]==0) {
                            throw new NullPointerException();
                        }
                        System.out.println("Please enter an integer value to search: ");         //print statement to the user
                        key =Integer.parseInt(search.readInout());         //input integer from BinaryLinearSearch class
                        startNano = BinaryLinearSearch.nanoTime();      //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();       //return time in miilis and instantiate into startMillis
                        index = search.iterativeBinarySearch(key, randarr);     //search for the key in using class BinaryLinearSearch
                        estimateTimeNano = BinaryLinearSearch.nanoTime() - startNano;       //calculate the time take tp run the method in nano
                        estimateTimemMllis = BinaryLinearSearch.currentTimeMillis() - startMillis;       //calculate the time take tp run the method in millis
                        if (index != -1) {        //statment if the result is not -1
                            System.out.printf("%d was found at index position %d:   Iterative Binary Search\n", key, index);        // print the result of the search
                        } else {
                            System.out.printf("%d was not found : recursive Binary Search\n", key);     //print that there no key found
                        }
                        System.out.println("Time taken in nanoseconds:" + estimateTimeNano);        //print the result for how long to nano
                        System.out.println("Time taken in milliseconds: " + estimateTimemMllis);         //print the result for how long to millis
                        startNano = BinaryLinearSearch.nanoTime();       //return time in nano and instantiate into startNano
                        startMillis = BinaryLinearSearch.currentTimeMillis();        //return time in miilis and instantiate into startMillis
                        index = search.iterativeLinearSearch(key, randarr);     //search for the key in using class BinaryLinearSearch
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
        }while(choice!=4);  //exit the loop when choose 4


    }
}
