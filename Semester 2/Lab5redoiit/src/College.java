import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * a class that create an array of student and uses Polymorphism to create an object in the array from the type of student needed 
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
  **/
public class College {
	
	//declare private instaences 
	private String name;
	//private Student [] students;
	private ArrayList<Student> students;
	private Student fullTime;
	private Student partTime;


	/**Constructor that take the array size and name of the college 
	 * @param name it sets the name of the college
	 * @param studentnum it set the number of students to enter and set the array size
	 * **/
	public College(String name,int studentnum) {
		this.name=name;
		students=new ArrayList<>(studentnum);//declare the size of the array
	}

	public void printstars(){
		for (int i=0;i<=100;i++){
			System.out.print("=");
		}
		System.out.println();
	}

	/**method that will print the name of the college and the title for table of information **/
	public void printTitle() {
		printstars();
		System.out.printf("%s - List of Students%n",name);//print name of college and built in title "List of Students"
		printstars();
		//print the title of the table
		System.out.printf("%10s|\t%10s|\t%15s|%25s|\t%13s|\t%5s|%7s|%10s|%n","Program","Student#","Name","Email","Phone","GPA","Fees","Credits");
	}

	
	/**method that read the type of student and read into the array using the needed class to do so **/
	public void ReadStudentsDetails(Scanner input) {
		boolean b = true;
		do {
			try{
			System.out.println("Enter details of student" + (students.size() + 1) + ": ");
			System.out.println("===========================");
			System.out.println("1 - Fulltime student\n" + "2 - Parttime Student");
			System.out.print("Enter Student type: ");
			int choice = input.nextInt();//uses input class to read integer
			switch (choice) {
				case 1:
					fullTime = new FulltimeStudent();
					//students[i] = new FulltimeStudent();//declare the array in the place of FulltimeStudent class
					//students[i].readInfo();
					students.add(fullTime);
					fullTime.readInfo(input);
					b = false;
					break;
				case 2:
					//students[i] = new ParttimeStudent();//declare the array in the place of ParttimeStudent class
					//students[i].readInfo();
					partTime = new ParttimeStudent();
					students.add(partTime);
					partTime.readInfo(input);
					b = false;
					break;
				default:
					System.out.println("Wrong student type");
					break;
			}
			}catch(InputMismatchException e){
				System.err.println("Invalid student type");
				input.nextLine();
			}catch (Exception e){
				System.out.println("genral exception");
				input.nextLine();
			}

		} while (b);
	}



	public void readfromfile(Scanner input){
		try {
			input = new Scanner(Paths.get("students.txt"));
		}catch (FileNotFoundException fie){
			System.out.println("File not found");
		}catch (IOException io){
			System.out.println("io exception ");
		}
		while (input.hasNext()){

			char studenttype=input.next().charAt(0);
			switch (studenttype){
				case 'f':
					fullTime=new FulltimeStudent();
					students.add(fullTime);
					fullTime.readInfofile(input);
					break;
				case 'p':
					partTime=new ParttimeStudent();
					students.add(partTime);
					partTime.readInfofile(input);
					break;
			}
		}


	}

	
	/**method that print the array of student **/
	public void printStudentDetails() {
		if (students.isEmpty()){
			System.out.println("#### no student to dispaly ####");
		}else {
			printTitle();
			for (int i = 0; i < students.size(); i++) {
				students.get(i).printInfo();
			}
		}
	}

}
