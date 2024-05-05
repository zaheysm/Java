import java.util.ArrayList;

public interface Policies {
	/**declare final variables that wont be changed in other class or this class**/
	final int maxMarks=100;
	/**declare final variables that wont be changed in other class or this class**/
	final double maxGpa=4.0;
	
	/**method that will be used to calculate the gpa in other class 
	 * @param marks array to set all the marks that is been input 
	 * **/
	public void calculateGpa(ArrayList<Double> marks);
	

}
