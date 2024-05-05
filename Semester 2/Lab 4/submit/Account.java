import java.util.Scanner;

/**
 * class that represent account which hold the balance and account number add to that person features 
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 */


public abstract class Account {
	
	
	//private parameters declared to instantiate person object , account number and balance    
	private long accNumber;
	private Person accHolder=new Person();
	protected double balance;
	
	/**
	 * method that reads account information and checks if the info that entered is valid
	 * @param scan it's scanner class object that we need to input to the parameters 
	 */
	public void readAccountDetails(Scanner scan) {
		System.out.print("enter account number: ");
		TestInput.testLong(scan);//method that will check Long is being input 
		accNumber=scan.nextLong();
		scan.nextLine();// clean up the input stream
		accHolder.readPersonalDetails(scan);
		System.out.print("enter balance: ");
		TestInput.testDouble(scan);//method that will check double is being input 
		balance=scan.nextDouble();
	}
	
	/**
	 * method that will print the parameters 
	 */
	public void displayAccount() {
		System.out.printf("%10s|\t%15s|\t%20s|%12d|\t%7.2f %n",accNumber,accHolder.getFullName(),accHolder.getEmail(),accHolder.getPhoneNumber(),balance);
		//System.out.println(accNumber+" "+accHolder.getFullName()+" "+accHolder.getEmail()+" "+accHolder.getPhoneNumber()+" "+balance);
	}
	/**
	 * abstract class to update the balance depend whether checking or saving account  
	 */
	abstract public void updateBalance();
	
	/**
	 * method to make sure that we enter only numbers    
	 * @param scan it's scanner class object that we need to input to the parameters 
	 */
	public static void checkLong(Scanner scan) {
		while(!scan.hasNextLong()) {
			scan.nextLine();// clean up the input stream
			System.out.println("Number entered is not Integer please enter again");
		}
	}
	

}
