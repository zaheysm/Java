import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * This class contains items database and asks other class to add item according to its specification
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class Inventory {

    private FoodItem[] inventory;       //declare Food item object array
    private int numItems;       //declare number of items being added

    /**
     * Constructor for the class to instantiate the array and num items
     */
    public Inventory() {
        inventory = new FoodItem[20];      //instantiate the array
        numItems = 0;       //instantiate the num items
    }


    /**
     * override method of to string to print the array
     * @return string of the items in one line
     */
    public String toString() {
        String printer = "";
        System.out.println("Inventory:");
        for (int i = 0; i < numItems; i++) {
            printer = printer + inventory[i].toString() + "\n";
        }
        return printer;
    }

    /**
     * test if the item is exist
     * @param item food time class object
     * @return  returns 1 if it's the same code item or -1 it it's not
     */
    public int alreadyExists(FoodItem item) {

        if (item.isEqual(item)) {       //if statement to test it's the same
            return 1;
        }
        return -1;
    }


    /**
     * Method that will sort the array in quick sort
     * @param itemArry Food item class array
     * @param start    start of the array
     * @param end      end of the array
     */
    private void quickSort(FoodItem[] itemArry, int start, int end) {
        if (start < end)         //statement if the start is smaller than end
        {
            int index = sortPart(itemArry, start, end);      //last index worked on
            quickSort(itemArry, start, index - 1);       //recursive run of the array from start to index
            quickSort(itemArry, index + 1, end);          //recursive run of the array from index to end
        }
    }

    /**
     * method that will sort in partition
     * @param itemArry Food item class array
     * @param start    start of the array
     * @param end      end of the array
     * @return index to strat from
     */
    private int sortPart(FoodItem[] itemArry, int start, int end) {
        FoodItem temp;
        int pivot = itemArry[end].getItemCode();       //assume the last integer is the bigger one
        int index = start - 1;      //the start for the loop

        for (int i = start; i < end; i++) {     //loop
            if (itemArry[i].getItemCode() < pivot) {       //if the last integer is the smallest

                index++;        //increment the value
                temp = itemArry[index];     //put the number in temp value
                itemArry[index] = itemArry[i];        //the smaller value goes to the start
                itemArry[i] = temp;      //the bigger value goes to the end
            }
        }
        temp = itemArry[index + 1];      //put the number in temp value
        itemArry[index + 1] = itemArry[end];      //the smaller value goes to the start
        itemArry[end] = temp;        //the bigger value goes to the end


        return (index + 1);  //return the index from where to start the next search
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
    public int recursiveBinarySearch(int itemCode, FoodItem[] itemArry, int first, int last) {
        if (first <= last) {      //condition first smaller than last
            int mid = first + (last - first) / 2;     //the new start of the search
            if (itemArry[mid].getItemCode() < itemCode) {     //statement if array in place of smaller than key we are searching
                first = mid + 1;        //instantiate first to mid +1
                return recursiveBinarySearch(itemCode, itemArry, first, last);     //run the method again
            } else if (itemArry[mid].getItemCode() == itemCode) {     //statement if array in place of smaller than key we are searching
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
     * @return boolean if it was successful or not
     */
    public boolean addItem(Scanner scan) {
        boolean b = false;      //declare boolean
        final char fruit = 'f';     //declare char for fruit
        final char vegetable = 'v';     //declare char for vegetable
        final char preserve = 'p';      //declare char for preserve
        do {        //do while loop
            System.out.print("Do you wish to add a fruit(f), vegetable(v) or a preserve(p)? ");     //print statement
            char choice = TestInputs.testEmptyString(scan).charAt(0);       //input char for the type of food item
            switch (choice) {       //switch statement
                case fruit:
                    inventory[numItems] = new Fruit();      //declare new fruit object
                    b = inventory[numItems].addItem(scan);      //method to an item in place of numItems for the array
                    numItems++;     //increase the numItems by 1
                    break;
                case vegetable:
                    inventory[numItems] = new Vegetable();      //declare new vegetable object
                    b = inventory[numItems].addItem(scan);       //method to an item in place of numItems for the array
                    numItems++;     //increase the numItems by 1
                    break;
                case preserve:
                    inventory[numItems] = new Preserve();       //declare new preserve object
                    b = inventory[numItems].addItem(scan);       //method to an item in place of numItems for the array
                    numItems++;     //increase the numItems by 1
                    break;
                default:
                    System.out.println("Invalid entry");        //print statement
                    break;

            }
        } while (!b);       //loop condition

        return b;       //return boolean
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
                quickSort(inventory, 0, numItems - 1);      //sort the method
                int index = recursiveBinarySearch(itemCode, inventory, 0, numItems - 1);        //search for the code in the array
                int exist = alreadyExists(inventory[index]);        //make sure that the code exist
                boolean quantityGoods = false;      //declare boolean
                if (exist != -1) {      //if the item exist
                    if (buyOrSell) {        //what needed to be done true buy false sell
                        quantity = TestInputs.inputInteger(scan, "Enter valid quantity to buy: ");      //input quantity needed
                        quantityGoods = inventory[index].updateItem(quantity);      //method to update quantity
                    } else {
                        quantity = TestInputs.inputInteger(scan, "Enter valid quantity to sell: ");     //input quantity needed
                        quantityGoods = inventory[index].updateItem(quantity * -1);     //method to update quantity
                    }
                } else {
                    System.out.println("not found");        //print statement
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
}

