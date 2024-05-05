import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1 {

	/**
	 * @param args the main method to run the project
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);//scanner variable
		Numbers n=new Numbers();//instantiate class Numbers
		boolean b=true;//declare variable boolean
		do {//do while
			try {//try statement
				displayMainMenu();
				int option = Integer.parseInt(n.testEmptyString(scan));//declare option to input option
				switch (option) {//switch statement according to input of the user
					case 1:
						n = new Numbers();//Initialize class
						break;
					case 2:
						System.out.print("Enter new size of array:");//print statement
						int size = Integer.parseInt(n.testEmptyString(scan));//declare option to input option
						n = new Numbers(size);//Initialize class by size
						break;
					case 3:
						n.addValue(scan);//add value to the array
						break;
					case 4:
						System.out.println(n.toString());//print array
						break;
					case 5:
						float max = n.findMinMax()[0];//declare max variable and return from the method
						float min = n.findMinMax()[1];//declare min variable and return from the method
						float average = n.calcAverage();//calculate the average
						System.out.printf("Average is: %.2f, Minimum value is %.2f, Maximum value is %.2f \n", average, min, max);//print statemnt
						break;
					case 6:
						System.out.println("Exiting...");//print statement
						b = false;//change the boolean to false and exit the loop
						break;
					default:
						System.out.println("Option entered is invalid");//in-case the user inputs any other number from teh menu
				}
				System.out.println();//print new line
			}catch (InputMismatchException e){
				System.out.println("Array only can except decimal numbers... Please try again");
				scan.nextLine();//clear input
			}catch (IllegalAccessException e){//catch error
				System.out.println("You must input integer ... Please try again");//print statement
			}catch (NumberFormatException e){
				System.out.println("You must input integer ... Please try again");//print statement
			}catch (Exception e){//general catch
				System.out.println(e.getMessage()+" general error");//print error
			}
		}while (b);//loop statement
		scan.close();
	}	
	/**
	 * method that will print the menu to the user
	 */
	public static void displayMainMenu() {
		
		System.out.print("Please select one of the following:\n" +
				"1: Initialize a default array\n" +
				"2: To specify the max size of the array\n" +
				"3: Add value to the array\n" +
				"4: Display values in the array\n" +
				"5: Display average of the values, minimum value, maximum value\n" +
				"6: To Exit\n" +
				"> ");//print menu
	}

}
