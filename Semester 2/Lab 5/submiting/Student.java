import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person implements Policies {


	/**
	 * declare private instances to host the Student Number
	 */
	protected int studentNumber;
	/**
	 * declare private instances to host the Program Name
	 */
	protected String programName;
	/**
	 * declare private instances to host the GPA
	 */
	protected double gpa;

	/**a method that is override from Person class to read the info of person and
	 *  the variables in this class and call method readmarks throw keyboard
	 * @param input Scanner class
	 *  */
	@Override
	public void readInfoKeyboard(Scanner input) {
		System.out.print("Enter program name: ");
		programName = TestInputs.testEmptyString(input);//uses input class to read string nd test it it's empty
		System.out.print("Enter student number: ");
		studentNumber = TestInputs.inputInteger(input);//uses input class to read integer and checks if it's integer and it's above zero
		System.out.print("Enter first name: ");
		firstName =TestInputs.testEmptyString(input);//uses input class to read string nd test it it's empty
		System.out.print("Enter last name: ");
		lastName = TestInputs.testEmptyString(input);//uses input class to read string nd test it it's empty
		System.out.print("Enter email Id: ");
		emailId = TestInputs.testEmptyString(input);//uses input class to read string nd test it it's empty
		System.out.print("Enter phone number: ");
		TestInputs.testLong(input);//test if it's long and not something else
		phoneNumber = input.nextLong();//uses input class to read long
		readMarks(input);
	}


	/**a method that is override from Person class to read the info of person threw a file
	 * @param input Scanner class
	 */
	public void readInfoFile(Scanner input){
		studentNumber= input.nextInt();
		firstName= input.next();
		lastName= input.next();
		emailId= input.next();
		phoneNumber= input.nextLong();
		programName=input.next();
		gpa=input.nextDouble();
	}




	//method that read all number of courses and read each mark for the course and store in the array and call method calculateGpa
	//this method only used in this class 
	private void readMarks(Scanner input) {
		boolean b=true;
		do {
			try {
				System.out.print("Enter number of courses: ");
				int coursNum = TestInputs.inputInteger(input);//uses input class to read integer and checks if it's integer and it's above zero
				if (coursNum <= 0) {
					throw new IllegalArgumentException("Number should be positive.. Please try again!");
				}
				ArrayList<Double> marks = new ArrayList<>(coursNum);//declare the array and with size that is been read
				for (int i = 0; i < coursNum; i++) {
					System.out.print("Enter mark " + (i + 1) + ": ");
					double mark = input.nextDouble();
					if (mark <= maxMarks && mark >= 0) {//tests if the mark between 0 and 100
						marks.add(mark);//uses input class to read double
					} else {
						i--;//reset i to the previous value
						System.out.println("the max mark to enter is 100 and min mark to enter is 0 please enter again");
					}
				}
				calculateGpa(marks);
				b = false;
			}catch (IllegalArgumentException e){
				System.out.println(e.getMessage());
			}catch (Exception e){
				System.err.println("General Error");
			}
		}while(b);
	}

	/**
	 * method that is override from policies class that take the array that been created in method readMarks and sums it up
	 * 	and calculate the gpa and store in gpa variable
	 * @param marks array to set all the marks that is been input
	 */
	@Override
	public void calculateGpa(ArrayList<Double> marks) {
		double sum=0;//declare double variable
		for (double mark:marks){
			sum+=mark;//sums the array
		}
		gpa=(sum/(double)(marks.size()*maxMarks))*maxGpa;//calculate the gpa
	}	

	/**method that is being override from class Person and print the info of person and program name and student number using printf */
	@Override
	public void printInfo() {
		System.out.printf("%10s|%10d|%15s|%25s|%13d|%5.2f|",programName,studentNumber,firstName+" "+lastName,emailId,phoneNumber,gpa);
	}

}
