
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Main class that will run the program to read info ,update balance and print info
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 */
public class BankTest {
	
	/**
	 * method to run the program
	 * @param args control the main class to run the program
	 */
	public static void main(String[] args) {
		boolean looprun=true;
		do {
		//main scanner to scan and input info of the program
		Scanner scan=new Scanner(System.in);
		try {
			
			System.out.print("Enter the name of the bank :");		
			String name=TestInput.testEmptyString(scan);// read name of the bank
		
			
			System.out.print("How many account holder do you have :");
			TestInput.testInt(scan);//method that will check intger is being input 
			int size=scan.nextInt();//read number of accounts 
			scan.nextLine();// clean up the input stream
			Bank b=new Bank(size,name);	//declare object of bank
			int choice;//declare choice to choose the option needed
			do {//do while that will run at least once to run depend on the choice 
				System.out.println("1. Read Accounts\n2. Run monthly Process\n3. Display Accounts\n4. Exit");
				System.out.print("Enter your option: ");
				TestInput.testInt(scan);//method that will check intger is being input 
				choice=scan.nextInt();//read the choice
				scan.nextLine();// clean up the input stream
				switch (choice) {
				case 1:
					b.readAccounts(scan);//read account info
					break;
				case 2:
					b.runMonthlyProcess();// run monthly report to update the new balance
					break;
				case 3:
					b.displayAccounts();// print the info 
					break;
				case 4:
					System.out.println("Goodbye... Have a nice day");//print statement to print when exit
					looprun=false;
					break;
				default:
					System.out.println("Invalid  entry... Please try again");//print error when wrong option got chose
					break;
				}
				
			} while (choice!=4);//exit loop
		}catch(InputMismatchException e){
			System.out.println("the input is incorrect");
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("genaral error");
			scan.nextLine();
			
		}
		}while (looprun);
		

	}

}
