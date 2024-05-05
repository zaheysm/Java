import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * CET - CS Academic Level 3
 * This class contains the menu that preforms adding ,buying and selling items
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 *
 */
public class Assign1 {
    /**
     * the main class in the method to run the main menu
     * @param args the main method to run the project
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);        //Scanner object to scan inouts
        Inventory items=new Inventory();        //instantiate Inventory class
        int choice=0;        //declare choice for switch
        boolean b=false;        //boolean variable to test true to adding ,buying or selling
        do {        //do while
            try {       //try catch statement
                displayMenu();      //method to print main menu
                choice = Integer.parseInt(TestInputs.testEmptyString(scan));        //input statement to choose needed

                switch (choice) {       //switch statement
                    case 1:
                        b=items.addItem(scan);      //add item method and return true or false
                        if(!b){     //test if their error in adding item
                            System.out.println("Error in adding item");  //print error statement
                        }
                        break;
                    case 2:
                        System.out.println(items.toString());       //print the items
                        break;
                    case 3:
                        b=items.updateQuantity(scan, true);     //method to buy item ,send true to buy item
                        if(!b){     //test if their error in adding item
                            System.out.println("Error...could not buy item");     //print error statement
                        }
                        break;
                    case 4:
                        b=items.updateQuantity(scan, false);      //method to buy item ,send true to sell item
                        if(!b){     //test if their error in adding item
                            System.out.println("Error...could not sell item");         //print error statement
                        }
                        break;
                    case 5:
                        System.out.println("Exiting...");       //print statement
                        break;
                    default:
                        System.out.println("Please enter numbers between 1-5...Try Again");     //print error if it's outside the select menu
                }
            }catch (InputMismatchException e){      //catch input Mismatch statement
                System.err.println("**** Invalid entry ****");      //print error to the user
            }catch (NumberFormatException e){        //catch incorrect number format
                System.err.println("**** Please enter an integer ****");
            }
        }while(choice!=5);      //loop condition

    }

    /**
     * Mehtod print the main menu
     */
    public static void displayMenu(){
        System.out.print("Please select one of the following:\n" +      //print statement
                "1: Add Item to Inventory\n" +
                "2: Display Current Inventory\n" +
                "3: Buy Item(s)\n" +
                "4: Sell Item(s)\n" +
                "5: To Exit\n"+
                ">");

    }
}
