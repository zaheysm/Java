import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This class contains the vegetable items and enable to add items and print them
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class Vegetable extends FoodItem{

    private String farmName;         //declare the item farm name

    /**
     * override method of to string to print the items
     * @return string of the items in one line
     */
    @Override
    public String toString(){
        String str=super.toString();
        return str+" size: "+ farmName;
    }

    /**
     * method prompt messages and input them
     * @param scan scanner class object
     * @return boolean if it was successfully or not
     */
    @Override
    public boolean addItem(Scanner scan){
        super.addItem(scan);
        System.out.print("Enter the name of the farm supplier: ");
        farmName=TestInputs.testEmptyString(scan);

        return true;
    }
}
