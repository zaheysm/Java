import java.util.InputMismatchException;
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
		Scanner input=new Scanner(System.in);
		System.out.print("Enter name of College: ");
		String name=input.nextLine();//uses input scanner to read text
		boolean b=true;
		int n=0;
		do{
		try {
			System.out.print("Enter number of students: ");
			n = input.nextInt();//uses input to read integer
			if (n<=0){
				throw new IllegalArgumentException("number should be positive ");
			}
			b=false;
		}catch (InputMismatchException e) {
			System.err.println("Input Missmatch Eception while reading numbers of student ");
			input.nextLine();
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
			input.nextLine();
		}catch (Exception e){
			System.out.println(" general error ");
			input.nextLine();
		}
		}while(b);
		College c1=new College(name,n);//declare College class and send name of college and number of students
		b=true;
		do {
			try {
				System.out.print("1. Read students from keyboard \n" +
						"2. Read students from file \n" +
						"3. Print Students details \n" +
						"4. Exit \n" +
						"Enter you option: ");
				int option = input.nextInt();

				switch (option) {
					case 1:
						c1.ReadStudentsDetails(input);
						break;
					case 2:
						c1.readfromfile(input);
						break;
					case 3:
						c1.printStudentDetails();
						break;
					case 4:
						System.out.println("Good bye... have a nice day");
						b = false;
						break;
					default:
						System.out.println("invalid entry ");
						break;
				}
			}catch(InputMismatchException e){
				System.err.println("Input miss match in user menu ");
				input.nextLine();
			}catch (Exception e){
				System.out.println("general error");
				input.nextLine();
			}
		}while(b);

		input.close();
	}


}
