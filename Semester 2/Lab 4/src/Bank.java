import java.util.ArrayList;
import java.util.Scanner;

/**
 * class that will ask the type of account and run the process to update the balance after fees or checking or read the info of the account or print it 
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 */
public class Bank {
	
	//private parameters declared to instantiate Account object , name if the bank   
	private static String name;
	private ArrayList <Account> accounts;
	/**
	 * constructor that set the name of the bank and the size of accounts need to be created 
	 * @param size the number of account holder needed
	 * @param bankName this is the bank name
	 */
	public Bank(int size,String bankName) {
		
		name=bankName;
		accounts=new ArrayList<Account>(size);
	}
	
	/**
	 * method that will ask what kind of account need to be created and it creates and read the info
	 * @param scan Scanner class to read info 
	 */
	public void readAccounts(Scanner scan) {
		int choice=0;//declare variable choice for the switch
		// do while loop to at least run once to enter the type of the account
		do {
		System.out.println("1. Checking\n2. Savings");
		System.out.print("Enter the type of the account you want to create:");
		TestInput.testInt(scan);//method that will check intger is being input 
		choice=scan.nextInt();
		scan.nextLine();// clean input stream
		switch (choice) {//chose the type of account 
		case 1:
			Account checking=new Checking();
			accounts.add(checking);//Checking account
			checking.readAccountDetails(scan);
			break;
		case 2:
			Account savings=new Savings();
			accounts.add(savings);//saving account
			savings.readAccountDetails(scan);
			break;
		default:
			System.out.println("The opption selcted is wrong, please try again");//in case any selection other than those it will get an error 
			break;
		}
		}while(choice!=1 && choice!=2);
		
		

		
	}
	
	/**
	 * method that update the balance of all accounts according to the type of the account 
	 */
	public void runMonthlyProcess() {
		//check if the array is empty
		if (accounts.isEmpty()) {
			System.out.println("No accounts to process");//print error if it's empty
		}
		else {//Update all accounts balance				
			for (int i = 0; i < accounts.size(); i++) {	
				accounts.get(i).updateBalance();
			}
		}
	}
	
	/**
	 * method that checks if there any accounts and print them  
	 */
	public void displayAccounts() {
		if (!accounts.isEmpty()) {//is the array is not empty
			printTitle();
			for (Account account : accounts) {
				account.displayAccount();//run method to print account detail 
			}
		}
		else {
			System.out.println("No account to display");//print error if array is empty 
		}
	}
	
	/**
	 * method that print stars line
	 */
	public static void printStar() {
		
		System.out.println("******************************************************************************************");
	}
	
	
	/**
	 * method that print the titles of the table including name of the bank and title for the columns 
	 */
	public static void printTitle() {
		
		printStar();
		System.out.printf("\t\t\t\t%10s Bank\t\t\t\n",name);
		printStar();
		System.out.printf("%10s|\t%15s|\t%20s|%12s|\t%7s %n","Acc number","Name","Email","Phone Number","Balance");
		printStar();
		
		
	}
	

}
