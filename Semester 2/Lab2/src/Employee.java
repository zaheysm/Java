//parent class that read common information to class Regular and Contractor
public class Employee {
	
	private int employeeNumber;//declare int 
	private Person emp;//declare emp object of class Person
	
	//Constructor that take arguments of employee class 
	public Employee(int employeeNumber,String firstName,String lastName,String email,long phoneNumber) {
		this.employeeNumber=employeeNumber;
		this.emp=new Person(firstName,lastName,email,phoneNumber);
		
	}
	
	//empty Constructor
	public Employee(){
		
	}
	
	//method that will input all the info of this class 
	public void readEmployee() {
		System.out.print("Enter Employee Number:");
		this.employeeNumber=Inputs.inputInteger();//input integer use static method from inputs class
		System.out.print("Enter first name:");
		String firstName=Inputs.inputText();//input string use static method from inputs class
		System.out.print("Enter last name:");
		String lastName=Inputs.inputText();//input string use static method from inputs class
		System.out.print("Enter email:");
		String email=Inputs.inputText();//input string use static method from inputs class
		System.out.print("Enter phone number:");
		long phoneNumber=Inputs.inputLong();//input long use static method from inputs class
		emp=new Person(firstName,lastName,email,phoneNumber);//Instantiate constructor of person class 
	
		
	}
	//method that print the info in a certain format 
	public void printEmployee() {
		//print statement that print the variables with 15 spaces if needed 
		System.out.printf("%15d|%15s|%15s|%15d|",employeeNumber,emp.getFullName(),emp.getEmail(),emp.getPhoneNumber());
	}
	

}
