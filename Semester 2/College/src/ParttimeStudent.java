/**	 
 * it's a subclass that is inherit from student and read or print extra info for part time Student
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 * */
public class ParttimeStudent extends Student{
	
	private double courseFeesTotal;
	private double credits;
	
	/** override method that is being read more info into readInfo method added to what been used, using the super key
	  **/
	@Override
	public void readInfo() {
		super.readInfo();//call the super class method
		System.out.print("Enter total course fees: ");
		courseFeesTotal=Inputs.inputDouble();//uses input class to read double 
		System.out.print("Enter credit hours: ");
		credits=Inputs.inputDouble();//uses input class to read double 
	}
	
	/**override method that is being print more info into printInfo method added to what been used, using the super key**/
	@Override
	public void printInfo() {
		super.printInfo();//call the super class method
		System.out.printf("%7.2f|%10.2f|%n",courseFeesTotal,credits);
	}

}