import java.util.Scanner;

/**
 * Description:Program that will enter student info and calculate the gpa according to the marks entered 
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6 
	**/
public class CollegeSystemTest {
	/**the main method that will create College class object and run the method inside of it
	 * @param args the main method to run the project**/
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in)
;		System.out.print("Enter name of College: ");
		String name=input.nextLine();//uses input scanner to read text
		
		System.out.print("Enter number of students: ");
		int n=Inputs.inputInteger();//uses input to read integer
		
		College c1=new College(name,n);//declare College class and send name of college and number of students  
		
		c1.ReadStudentsDetails();//call method from College class to read the details of students 
		c1.printTitle();//call method from College class to print title of the table 
		c1.printStudentDetails();//call method from College class to print student information 

		input.close();
	}

}
