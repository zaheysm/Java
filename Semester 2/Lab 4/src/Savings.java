
/**
 * class that calculate balance plus interestRate for checking 
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 */
 
public class Savings extends Account{
	
	//declare double  interestRate
	private double interestRate;
	
	/**
	 * Constructor that instantiate interest Rate to 3.99%
	 */
	public Savings() {
		interestRate=3.99;
	}
	
	/**
	 * method that will update the balance for the checking accounts according to the interestRate
	 */
	@Override
	public void updateBalance() {
		balance=balance+(balance*(interestRate/100)/12);
	}
	

}
