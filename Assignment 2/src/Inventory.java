
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.*;
import java.nio.file.Paths;

/**
 * CET - CS Academic Level 3
 * This class contains items database and asks other class to add item according to its specification
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 * @version 1.1
 */
public class Inventory {

    private static DoublyLinkedGeneric<FoodItem> inventory;       //declare Food item object array
    private int numItems;       //declare number of items being added
    private FoodItem fooditem;  //declare item for inputting in the Array List
    private final char fruit = 'f';     //declare char for fruit
    private final char vegetable = 'v';     //declare char for vegetable
    private final char preserve = 'p';      //declare char for preserve

    /**
     * Constructor for the class to instantiate the array and num items
     */
    public Inventory() {
        inventory =new DoublyLinkedGeneric<FoodItem>();      //instantiate the array
        numItems = 0;       //instantiate the num items
    }


    /**
     * override method of to string to print the array
     * @return string of the items in one line
     */
    public String toString() {
        String printer = "";  //instantiate empty string
        System.out.println("Inventory:");       //print statement
        for (int i = 0; i < numItems; i++) {        //read teh array
            printer = printer + inventory.toString() + "\n";     //fill the variable string with array
        }
        return printer;     //return string
    }

    /**
     * test if the item is exist
     * @param item food time class object
     * @return  returns 1 if it's the same code item or -1 it it's not
     */
    public int alreadyExists(FoodItem item) {
        int index=-1;
        if (item.isEqual(item)) {       //if statement to test it's the same
             index=recursiveBinarySearch(item.getItemCode(),inventory,0,numItems-1);        //make sure item not found
            return index;       //return item
        }
        return index;       //return -1 if nothing found
    }


    /**
     * method that will run recursive Binary Search in an array
     *
     * @param itemCode parameter to search in the array
     * @param itemArry Food item class array
     * @param first    first index of the array
     * @param last     last index of the array
     * @return index where the key found or -1 if not found
     */
    public int recursiveBinarySearch(int itemCode,DoublyLinkedGeneric<FoodItem> itemArry, int first, int last) {
        if (first <= last) {      //condition first smaller than last
            int mid = first + (last - first) / 2;     //the new start of the search
            if (itemArry.search(mid).getItemCode() < itemCode) {     //statement if array in place of smaller than key we are searching
                first = mid + 1;        //instantiate first to mid +1
                return recursiveBinarySearch(itemCode, itemArry, first, last);     //run the method again
            } else if (itemArry.get(mid).getItemCode() == itemCode) {     //statement if array in place of smaller than key we are searching
                return mid;     //return the index of the search key found
            } else {        //else statement
                last = mid - 1;     //instantiate last to mid +1
                return recursiveBinarySearch(itemCode, itemArry, first, last);     //run the method again
            }
        }
        return -1;      //return -1 if there is no key found
    }

    /**
     * method that will show menu for the user and prompt which food item to add
     * @param scan scanner object
     * @param fromFile how to read item from file or manual
     * @return boolean if it was successful or not
     * @throws IllegalAccessException if the item is duplicate
     */
    public boolean addItem(Scanner scan, boolean fromFile) throws IllegalAccessException {
        boolean b = false;      //declare boolean
        char choice;

        do {        //do while loop
            if (fromFile) {
                System.out.print("Do you wish to add a fruit(f), vegetable(v) or a preserve(p)? ");     //print statement
                choice = TestInputs.testEmptyString(scan).charAt(0);       //input char for the type of food item
                b = itemSelect(choice, scan, fromFile);
            } else {
                try {
                    System.out.print("Enter the filename to read from: ");      //print statement
                    Path fileName = Paths.get(scan.next());     //enter the file name
                    scan = new Scanner(fileName);       //scan the file
                    while (scan.hasNext()) {        //while loop to scan the file
                        choice = scan.nextLine().charAt(0);     //get the first characters
                        b = itemSelect(choice, scan, fromFile);     //select item needed
                    }
                } catch (FileNotFoundException nfe) {
                    System.out.println("File not found"); //exception for file not found
                } catch (NoSuchFileException e) {
                    System.out.println("File Not Found, ignoring...");  //file not found
                    break;
                }catch (NoSuchElementException e) {
                    System.out.println("Invalid file name");    //wrong file name
                    scan.nextLine();
                } catch (IOException ioe) {
                    System.out.println(ioe.toString());     //exception for file io
                }

                }
        } while (!b);       //loop condition

        return b;       //return boolean
    }


    /**
     * method to select the item you want to add
     * @param choice chose the item you need to add
     * @param scan scanner object
     * @param fromFile is a file or manual entering item
     * @return ture or false if it was successfully
     * @throws IllegalAccessException if the code is existed
     */
    private boolean itemSelect(char choice,Scanner scan,boolean fromFile) throws IllegalAccessException{
        boolean b=false;
        switch (choice) {       //switch statement
            case fruit:
                fooditem = new Fruit();      //declare new fruit object
                break;
            case vegetable:
                fooditem = new Vegetable();      //declare new vegetable object
                break;
            case preserve:
                fooditem = new Preserve();       //declare new preserve object
                break;
            default:
                System.out.println("Invalid entry");        //print statement
                break;

        }
        try {
            fooditem.addItem(scan, fromFile);        //call method addItem to input item
            int exist = alreadyExists(fooditem);        //make sure that the code exist
            if (exist == -1) {
                b = inventory.add(fooditem);       //method to an item in place of numItems for the array
                Collections.sort(inventory);
                numItems++;     //increase the numItems by 1
            } else {
                throw new IllegalAccessException("Item code already exists\n" +
                        "Error Encountered while reading the file, aborting...");       //exception if the code don't exist
            }
        }catch (NullPointerException e){
            return b;                        // exception if the array is empty
        }


        return b;
    }

    /**
     *method that will update the quantity of the item
     * @param scan scanner object
     * @param buyOrSell boolean variable to test if the item for sale or to buy
     * @return boolean if it was successful or not
     */
    public boolean updateQuantity(Scanner scan, boolean buyOrSell) {

        try {       //try statement
            if (numItems > 0) {       //make sure that there is items in the array
                int quantity;       //declare quantity
                System.out.print("Enter the code for the item: ");      //print statement
                int itemCode = Integer.parseInt(TestInputs.testEmptyString(scan));      //input the item code needed
                int index = recursiveBinarySearch(itemCode, inventory, 0, numItems - 1);        //search for the code in the array
                boolean quantityGoods = false;      //declare boolean
                if (index != -1) {      //if the item exist
                    if (buyOrSell) {        //what needed to be done true buy false sell
                        quantity = TestInputs.inputInteger(scan, "Enter valid quantity to buy: ");      //input quantity needed
                        quantityGoods = inventory.get(index).updateItem(quantity);      //method to update quantity
                    } else {
                        quantity = TestInputs.inputInteger(scan, "Enter valid quantity to sell: ");     //input quantity needed
                        quantityGoods =inventory.get(index).updateItem(quantity * -1);     //method to update quantity
                    }
                }
                return quantityGoods;       //return true or false
            }
        } catch (ArrayIndexOutOfBoundsException e) {        //exception catch
            System.out.println();
        } catch (NumberFormatException e) {     //exception catch
            System.err.println("Please Enter Integer");     //exception catch
        }
        return false;       //return false
    }

    /**
     * method that will save the inventory into a file
     * @param scan Scanner object
     */
    public void saveFoodItemToFile(Scanner scan){
        Formatter output=null;      //formatter to format the file
        try{        //try statement
            System.out.print("Enter the filename to save to:");  //print statement
            String filename=TestInputs.testEmptyString(scan);       //input the file name
            output=new Formatter(filename);     //create the file
            for (FoodItem item:inventory){      //loop on the array
                if (item instanceof Fruit) {
                    output.format("%c\n", fruit);
                }else if(item instanceof Vegetable){
                    output.format("%c\n", vegetable);
                }else {
                    output.format("%c\n", preserve);
                }
                item.writeItemReadFromFile(output);     //method to input the file into
            }
        }catch (SecurityException e){
            System.out.println("Write Permeation Error");       //print statement
        }catch (IOException e){
            System.out.println("Error Opening file");        //print statement
        }
        if (output != null){
            output.close();     //close the file when it's done
        }
    }

    /**
     * Method that will search for item
     * @param scan scanner class to read info
     * @return true or false if the item found
     */
    public boolean searchForItem(Scanner scan) {
        System.out.print("Enter the code for the item: ");  //print statement
        String str=TestInputs.testEmptyString(scan);        //input the item to search
        int item = Integer.parseInt(str);       //make sure it's integer
        int index = recursiveBinarySearch(item, inventory, 0, numItems - 1);        //method to test the item is available

        if (index == -1) {      //if the item not found
            return false;       //return false
        } else {
            System.out.println(inventory.get(index));       //print the item that found
            return true;
        }
    }
}

