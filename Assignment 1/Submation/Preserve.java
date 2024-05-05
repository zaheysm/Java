import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * This class contains the Preserve items and enable to add items and print them
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class Preserve extends FoodItem{

    private int jarSize;        //declare the jar size item

    /**
     * override method of to string to print the items
     * @return string of the items in one line
     */
    @Override
    public String toString(){
        String str=super.toString();
        return str+" size: "+ jarSize;
    }

    /**
     * method prompt messages and input them
     * @param scan scanner class object
     * @return boolean if it was successfully or not
     */
    @Override
    public boolean addItem(Scanner scan){
        super.addItem(scan);
        jarSize=TestInputs.inputInteger(scan,"Enter the size of the jar in millilitres: ");
        return true;
    }

}
