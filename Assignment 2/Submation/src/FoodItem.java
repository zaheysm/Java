import java.util.Formatter;
import java.util.Scanner;
/**
 * CET - CS Academic Level 3
 * This class contains the main items and enable to add items and print them
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class FoodItem implements Comparable<Object>  {



    private int itemCode;       //declare the item code
    private String itemName;        //declare the item name
    private float itemPrice;        //declare the item price
    private int itemQuantityInStock;        //declare the item Quantity
    private float itemCost;     //declare the item cost

    /**
     * override method of to string to print the items
     * @return string of the items in one line
     */
    @Override
    public String toString(){

        return "Item: "+itemCode +" "+ itemName + " price: $" +itemPrice+ " cost $"+itemCost;       //return Food item format
    }

    /**
     * method that will test if the quantity being removed is valid
     * @param amount the amount added
     * @return true or false if quantity is valid
     */
    public boolean updateItem(int amount){
        int result=itemQuantityInStock+amount;      //the new stock  quantity
        if(result<0){       //test if the quantity in the minus
            return false;       //return false
        }else {     //else it's in positive
            itemQuantityInStock = result;       //instantiate itemQuantityInStock from result
            return true;     //return true
        }
    }

    /**
     * method to test if it's the same item code
     * @param item food item class object
     * @return boolean expiration if it's the same item or not
     */
    public boolean isEqual(FoodItem item){

        return itemCode==item.itemCode;     //test if it's the same item
    }

    /**
     * method prompt messages and input them
     * @param scan scanner class object
     * @param fromFile how to read item from file or manual
     * @return boolean if it was successfully or not
     */
    public boolean addItem(Scanner scan,boolean fromFile){
        boolean b=true;     //boolean variable
        do {        //do while loop for try and catch
            try {       //try statement
                if (fromFile) {     //is the file is from file
                    b = inputCode(scan);        //method to input item code
                    System.out.print("Enter the name for the item: ");      //print statement
                    itemName = TestInputs.testEmptyString(scan);     //input the item name
                    itemQuantityInStock = TestInputs.inputInteger(scan, "Enter the quantity for the item: ");        //input item quantity from Testinputs method
                    itemCost = TestInputs.testFloat(scan, "Enter the cost of the item: ");        //input item cost from Testinputs method
                    itemPrice = TestInputs.testFloat(scan, "Enter the sales price of the item: ");        //input item price from Testinputs method
                    b = false;      //change boolean to false if no error catches
                    return b;       //return the boolean
                }else{
                    addItemReadFromFile(scan); //read file items
                    return b;       //return the boolean
                }
            }catch (NumberFormatException e){       //catch input Mismatch statement
                System.err.println("Please Enter Integer");     //print error to the user
            }catch (Exception e){       //catch incorrect number format
                System.err.println("Invalid code ");        //print error to the user
            }
        }while (b);     //loop condition


        return b;       //return boolean
    }

    /**
     * method that will input the item code
     * @param scan scanner object
     * @return  return true if not error catch
     */
    public boolean inputCode(Scanner scan){
            System.out.print("Enter the code for the item: ");      //print statement
            String str=TestInputs.testEmptyString(scan);        //input code
            itemCode = Integer.parseInt(str);       //save code to item code
            return true;        //return successful
    }

    /**
     * getter method
     * @return the item code
     */
    public int getItemCode() {
        return itemCode;
    }


    /**
     * method instantiate the items from file
     * @param scan scanner class object
     */
    private void addItemReadFromFile(Scanner scan){
        itemCode=scan.nextInt();        //scan integer
        scan.nextLine();        //clear the whole line because of the format of the file
        itemName=scan.nextLine();       //scan string
        itemQuantityInStock=scan.nextInt();     //scan integer
        scan.nextLine();        //clear the whole line because of the format of the file
        itemPrice=scan.nextFloat();     //scan float
        scan.nextLine();        //clear the whole line because of the format of the file
        itemCost=scan.nextFloat();      //scan float
        scan.nextLine();        //clear the whole line because of the format of the file

    }

    /**
     * method to wirte the item to file
     * @param output Formatter class object
     */
    public void writeItemReadFromFile(Formatter output){
        output.format("%d\n%s\n%d\n%.2f\n%.2f\n",itemCode, itemName,itemQuantityInStock , itemPrice,itemCost);      //output the file foramt
    }

    /**
     * method to sort the array
     * @param comparestu object that will rescive the array
     * @return by which item you want to return
     */
    @Override
    public int compareTo(Object comparestu) {
        int compareage=((FoodItem)comparestu).getItemCode();        //sort the item by item code
        return this.itemCode-compareage;        // return Ascending order
    }
}
