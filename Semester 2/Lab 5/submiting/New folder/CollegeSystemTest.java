import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * Description:Program that will enter student info and calculate the gpa according to the marks entered or enter them from a file
 * @author Zahi Masarwa
 * @version 1.1
 * @since 15.6 
	**/
public class CollegeSystemTest {
	/**the main method that will create College class object and run the method inside of it
	 * @param args the main method to run the project
	 * @exception InputMismatchException if input miss match will threw error
	 * @exception IllegalArgumentException if input is negative will threw error in student number
	 * **/
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);//Scanner object
		System.out.print("Enter name of College: ");
		String name= TestInputs.testEmptyString(input); //uses test empty string to input and test if the it's empty
		int n=0;//initialize variable of how many students you want to input
		boolean b=true;//boolean expertion t
		do {
			try {
				System.out.print("Enter number of students: ");
				n =input.nextInt();//input integer 
				if (n<=0){//test if the output is negative
					throw new IllegalArgumentException("Number should be positive.. Please try again!");
				}
				b=false;
				} catch (InputMismatchException e) {//exception for inputing string or char instead of integer
				System.err.println("Input Mismatch Exception while reading a number of students... Please try again!\n");
				input.nextLine();
			}catch (IllegalArgumentException e){//exception for inputing negative or zero
				System.out.println(e.getMessage());
			}catch (Exception e){
				System.err.println("Unknown Error");
			}
		}while (b);
		b=true;
		College c1 = new College(name, n);//declare College class and send name of college and number of students
		do {


			try {
				System.out.print("1. Read Students info form keyboard\n" +
						"2. Read Students from file\n" +
						"3. Print details of all student\n" +
						"4. Exit\n");
				System.out.print("Enter you option: ");
				int choice = input.nextInt();//read the option that need to input
				switch (choice) {
					case 1:
						c1.ReadStudentsDetailsKeyboard(input);//call method from College class to read the details of students from keyboard
						break;
					case 2:
						c1.ReadStudentsDetailsFile(input);//call method from College class to read the details of students from file
						break;
					case 3:
						c1.printStudentDetails();//call method from College class to print student information
						break;
					case 4:
						b = false;
						System.out.println("Goodbye... Have a nice day");
						break;
					default:
						System.out.println("Invalid entry... Selection options 1-4... Please try again!");
						break;
				}
			}catch (InputMismatchException e){//exception for inputing string or char instead of integer
				System.err.println("Input Mismatch Exception while reading user's choice in main menu... Please try again!");
				input.nextLine();
			} catch (Exception e) {//general error in-case nothing get caught
				System.err.println("Unknown Error");
			}
		}while(b);
		input.close();

	}

}
