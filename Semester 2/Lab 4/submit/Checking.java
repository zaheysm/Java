
/**
 * class that calculate balance minus fees for checking 
 * @author Zahi Masarwa
 * @since 1.8
 * @version 1.0
 */
public class Checking extends Account{
	
	//declare double  fees
	private double fees;
	
	/**
	 * Constructor that instantiate fees to 13.50
	 */
	public Checking() {
		fees=13.50;
	}
	
	/**
	 * method that will update the balance for the checking accounts according to the fees
	 */
	@Override
	public void updateBalance() {
		balance=balance-fees;
	}

}
