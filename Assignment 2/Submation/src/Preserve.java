import java.util.Formatter;
import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * This class contains the Preserve items and enable to add items and print them
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 * @version 1.1
 */
public class Preserve extends FoodItem{

    private int jarSize;        //declare the jar size item

    /**
     * override method of to string to print the items
     * @return string of the items in one line
     */
    @Override
    public String toString(){
        String str=super.toString();        //read item from super class
        return str+" size: "+ jarSize +"mL";        //return Food item format
    }

    /**
     * method prompt messages and input them
     * @param scan scanner class object
     * @return boolean if it was successfully or not
     */
    @Override
    public boolean addItem(Scanner scan,boolean fromFile){
        super.addItem(scan,fromFile);        //read the super class
        if (fromFile) {      //test what needed file or manual
            jarSize=TestInputs.inputInteger(scan,"Enter the size of the jar in millilitres: ");     //print statement
        }else{
            jarSize=TestInputs.inputInteger(scan,"");       //input item
        }

        return true;        //return true
    }


    /**
     * method to wirte the item to file
     * @param output Formatter class object
     */
    @Override
    public void writeItemReadFromFile(Formatter output){
        super.writeItemReadFromFile(output);         //read super method
        output.format("%d\n",jarSize);      //output the file format
    }

}
