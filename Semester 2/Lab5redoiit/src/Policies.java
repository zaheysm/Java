import java.util.ArrayList;

/**
 * Interface class that holds final variables and method that will be used letter on 
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
**/
public interface Policies {
	/**declare final variables that wont be changed in other class or this class**/
	final int maxMarks=100;
	final double maxGpa=4.0;
	
	/**method that will be used to calculate the gpa in other class 
	 * @param marks array to set all the marks that is been input 
	 * **/
	public void calculateGpa(ArrayList<Double> marks);
	

}
