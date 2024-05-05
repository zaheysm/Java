import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.nio.file.Paths;


public class College {

	/**
	 * declare private instances to host the Name of College
	 */
	private String name;
	/**
	 * declare private instances to host the Array of student
	 */
	private ArrayList<Student> students;
	/**
	 * declare private instances to host FullTime Object
	 */
	private Student fullTime;//declare student of fulltime
	/**
	 * declare private instances to host PartTime Object
	 */
	private Student partTime;//declare student of parttime

	
	/**Constructor that take the array size and name of the college 
	 * @param name it sets the name of the college
	 * @param studentnum it set the number of students to enter and set the array size
	 * **/
	public College(String name,int studentnum) {
		this.name=name;
		this.students=new ArrayList<>(studentnum);//declare the size of the array

	}
	
	/**method that will print the name of the college and the title for table of information
	 * */
	public void printTitle() {
		System.out.println("===========================================================================================================");//print star line
		System.out.printf("\t\t\t\t\t%s - List of Students%n\n",name);//print name of college and built in title "List of Students"
		System.out.println("===========================================================================================================");//print star line
		//print the title of the table 
		System.out.printf("%10s|%10s|%15s|%25s|%13s|%5s|%7s|%10s|%n","Program","Student#","Name","Email","Phone","GPA","Fees","Credits");
	}
	
	/**
	 * method read the information of the student  from keyboard
	 * @param input Scanner class
	 * */
	public void ReadStudentsDetailsKeyboard(Scanner input) {
		int choice=0;

		do {
				try {
					System.out.println("Enter details of student " + (students.size() + 1) + ": ");
					System.out.println("===========================");
					System.out.println("1 - Fulltime student\n" + "2 - Parttime Student");
					System.out.print("Enter Student type: ");
					choice = input.nextInt();//uses testinput class to read integer and check it that it's integer and above 0
					input.nextLine();//clear stream input
					switch (choice) {
						case 1:
							fullTime=new FulltimeStudent();
							students.add(fullTime);//declare the array in the place of FulltimeStudent class
							fullTime.readInfoKeyboard(input);//read info for the arraylist
							break;
						case 2:
							partTime=new ParttimeStudent();
							students.add(partTime);//declare the array in the place of ParttimeStudent class
							partTime.readInfoKeyboard(input);//read info for the arraylist
							break;
						default:
							//i--;//when the user input the wrong choice to decrease i to the value that the loop start with
							System.out.println("Wrong student type");
							break;
					}

				} catch (InputMismatchException e) {//exception for inputing string or char instead of integer
					System.err.println("Input Mismatch Exception while reading student");
					input.nextLine();
				}catch (Exception e){//general error in-case nothing get caught
					System.err.println("Unknown Error");
				}
		}while (choice!=1 && choice!=2);


	}

	/**
	 * method read the information of the student  from file
	 * @param input Scanner object
	 */
	public void ReadStudentsDetailsFile(Scanner input){

		try{
			input=new Scanner(Paths.get("students.txt"));

		}catch(FileNotFoundException nfe){//exception for file not found
			System.out.println("File not found");
		}catch (IOException ioe){//exception for file io
			System.out.println(ioe.getLocalizedMessage());
		}
		while (input.hasNext()) {//read the file
			char choice=input.next().charAt(0);
			switch (choice) {//read the first char on the file
				case 'f':
					fullTime=new FulltimeStudent();
					students.add(fullTime);//add object of fulltime to the arraylist
					fullTime.readInfoFile(input);//read the info for the arraylist
					break;
				case 'p':
					partTime=new ParttimeStudent();
					students.add(partTime);//add object of parttime to the arraylist
					partTime.readInfoFile(input);//read the info for the arraylist
					break;
				default:
					System.out.println("Wrong student type");
					break;

			}
		}
	}

	
	/**method that print the array of student */
	public void printStudentDetails() {
		if(!students.isEmpty()) {//check if the array is empty
			printTitle();//call method from College class to print title of the table
			for (Student s : students) {
				s.printInfo();
			}
		}
		else{
			System.out.println("##### No students to display #####");
		}
	}

}
