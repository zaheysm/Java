import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: 
 * Student Number:  
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi PhD. 
 *
 */
public class Lab1 {

    /**
     * @param args
     */
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        Numbers num = new Numbers();

        do {//beginning of do-while loop
            try {//beginning of try-catch block
                switch (choice=displayMainMenu(input)) {
                    case 1:
                        num = new Numbers();
                        break;
                    case 2:
                        System.out.print("Enter size of array: ");
                        int max= Integer.parseInt(input.nextLine());//returned string is parsed into integer//returned string is parsed into integer
                        num = new Numbers(max);//user input assigned as size of array
                        break;
                    case 3:
                        num.addValue(input);//addition of elements into array
                        break;
                    case 4:
                        if(num.isEmpty()) {//if array is empty, message is displayed
                            System.out.println("Array is empty");
                        }else {
                            num.printArray();
                        }

                        break;
                    case 5:
                        System.out.println("Average: " + num.calcAverage() +
                                num.findMaxMin() + "\n");
                        break;
                    case 6:
                        System.out.println("Exiting");
                        break;
                    default:
                        System.out.println("Invalid Input");
                }
            } catch (InputMismatchException e) {
                System.out.println("Choose from options above!");
                input.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Please retry!");
            }catch (NullPointerException e){
                System.out.println("Array is empty");
            }
        } while (choice != 6);
    }

    private static int displayMainMenu(Scanner input) {
        // TODO Auto-generated method stub
        System.out.print("Please select one of the following:\n" +
                "1: Initialize a default array\n" +
                "2: To specify the max size of the array\n" +
                "3: Add value to the array\n" +
                "4: Display values in the array\n" +
                "5: Display average of the values, minimum value, maximum value\n" +
                "6: To Exit\n" +
                "> ");
        int result=input.nextInt();
        input.nextLine();
        return result;
    }
}