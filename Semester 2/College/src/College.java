/**
 * a class that create an array of student and uses Polymorphism to create an object in the array from the type of student needed 
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
  **/
public class College {
	
	//declare private instaences 
	private String name;
	private Student [] students;
	
	/**Constructor that take the array size and name of the college 
	 * @param name it sets the name of the college
	 * @param studentnum it set the number of students to enter and set the array size
	 * **/
	public College(String name,int studentnum) {
		this.name=name;
		this.students=new Student[studentnum];//declare the size of the array 
	}
	
	/**method that will print the name of the college and the title for table of information **/
	public void printTitle() {
		System.out.printf("%s - List of Students%n",name);//print name of college and built in title "List of Students"
		System.out.println("************************************");//print star line
		//print the title of the table 
		System.out.printf("%10s|\t%10s|\t%15s|%25s|\t%13s|\t%5s|%7s|%10s|%n","Program","Student#","Name","Email","Phone","GPA","Fees","Credits");
	}
	
	/**method that read the type of student and read into the array using the needed class to do so **/
	public void ReadStudentsDetails() {
		
		for (int i = 0; i < students.length; i++) {		
			System.out.println("Enter details of student"+(i+1)+": ");
			System.out.println("===========================");
			System.out.println("1 - Fulltime student\n"+ "2 - Parttime Student");
			System.out.print("Enter Student type: ");
			int choice=Inputs.inputInteger();//uses input class to read integer
			switch (choice) {
			case 1:
				students[i]=new FulltimeStudent();//declare the array in the place of FulltimeStudent class 
				students[i].readInfo();
				break;
			case 2:
				students[i]=new ParttimeStudent();//declare the array in the place of ParttimeStudent class 
				students[i].readInfo();
				break;
			default:
				i--;//when the user input the wrong choice to decrease i to the value that the loop start with 
				System.out.println("Wrong student type");
				break;
			}		
		}
	}
	
	/**method that print the array of student **/
	public void printStudentDetails() {
		for (int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
	}

}
