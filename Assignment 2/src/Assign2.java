import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * CET - CS Academic Level 3
 * This class contains the menu that preforms adding ,buying and selling items
 * Student Name: Zahi Masarwa
 * Student Number:  040985420
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi
 * @version 1.1
 */
public class Assign2 {
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
                        b=items.addItem(scan,true);      //add item method and return true or false
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
                            b=items.searchForItem(scan);
                            if(!b){
                                System.out.println("Code not found in inventory...");
                            }
                        break;
                    case 6:
                        items.saveFoodItemToFile(scan);
                        break;
                    case 7:
                        b=items.addItem(scan,false);
                        scan.nextLine();
                        break;
                    case 8:
                        System.out.println("Exiting...");       //print statement
                        break;
                    default:
                        System.out.println("Please enter numbers between 1-8...Try Again");     //print error if it's outside the select menu
                }
            }catch (InputMismatchException e){      //catch input Mismatch statement
                System.err.println("**** Invalid entry ****");      //print error to the user
            }catch (NumberFormatException e) {        //catch incorrect number format
                System.err.println("**** Please enter an integer ****");
            }catch (IllegalAccessException e){
                System.out.println(e.getMessage());
                scan.nextLine();
            }
        }while(choice!=8);      //loop condition
    scan.close();       //close scanner
    }

    /**
     * Mehtod print the main menu
     */
    public static void displayMenu(){
        System.out.print("Please select one of the following:\n" +
                "1: Add Item to Inventory\n" +
                "2: Display Current Inventory\n" +
                "3: Buy Item(s)\n" +
                "4: Sell Item(s)\n" +
                "5: Search for Item\n" +
                "6: Save Inventory to File\n" +
                "7: Read Inventory from File\n" +
                "8: To Exit\n" +
                "> ");

    }
}
