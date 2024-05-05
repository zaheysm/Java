
/**
 * class that inheritance from person class and policies class and will read and print the info
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
**/
public class Student extends Person implements Policies {

	
	//declare private variables the use of them will be inside of this class only
	private int studentNumber;
	private String programName;
	private double gpa;

	/**a method that is override from Person class to read the info of person and the variables in this class and call method readmarks**/
	@Override
	public void readInfo() {
		System.out.print("Enter program name: ");
		programName=Inputs.inputText();//uses input class to read string 
		System.out.print("Enter student number: ");
		studentNumber=Inputs.inputInteger();//uses input class to read integer 
		System.out.print("Enter first name: ");
		firstName=Inputs.inputText();//uses input class to read string 
		System.out.print("Enter last name: ");
		lastName=Inputs.inputText();//uses input class to read string 
		System.out.print("Enter email Id: ");
		emailId=Inputs.inputText();//uses input class to read string 
		System.out.print("Enter phone number: ");
		phoneNumber=Inputs.inputLong();//uses input class to read long 
		readMarks();
	}
	
	//method that read all number of courses and read each mark for the course and store in the array and call method calculateGpa
	//this method only used in this class 
	private void readMarks() {
		System.out.print("Enter number of courses: ");
		int coursNum=Inputs.inputInteger();//uses input class to read integer 
		double [] marks=new double[coursNum];//declare the array and with size that is been read 
		for (int i=0;i<marks.length;i++) {
			System.out.print("Enter mark "+(i+1)+": ");
			double mark=Inputs.inputDouble();
			if (mark<=maxMarks&&mark>=0) {//tests if the mark between 0 and 100 
				marks[i]=mark;//uses input class to read double 
			}
			else {
				i--;//reset i to the previous value  
				System.out.println("the max mark to enter is 100 and min mark to enter is 0 please enter again");
			}
		}
		calculateGpa(marks);
	}
	
	/**method that is override from policies class that take the array that been created in method readMarks and sums it up
	and calculate the gpa and store in gpa variable **/
	@Override
	public void calculateGpa(double[] marks) {
		double sum=0;//declare double variable 
		for (int i = 0; i < marks.length; i++) {
			sum+=marks[i];//sums the array 
		}
		gpa=(sum/(double)(marks.length*maxMarks))*maxGpa;//calculate the gpa 
	}	

	/**method that is being override from class Person and print the info of person and program name and student number using printf**/
	@Override
	public void printInfo() {
		System.out.printf("%10s|\t%10d|\t%15s|%25s|\t%13d|\t%5.2f|",programName,studentNumber,firstName+" "+lastName,emailId,phoneNumber,gpa);
	}

}
