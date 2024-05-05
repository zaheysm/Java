//class that will store the information into array 
public class Store {
	
	private Employee [] employees;//declare array of class object employee
	private final int Regular=1,Contractor=2;// declare int final for the switch statement 

	//Constructor that take parameter size to input the size of the array 
	public Store(int size) {
		this.employees=new Employee[size];
	}
	
	//method that run loop for how many employees we want to input and store in the array according to employee style  
	public void readEmployeeDetails() {
		
		for (int i=0;i<employees.length;i++) {//loop that will rung on length of the array 
			System.out.println("Enter details of employee "+(i+1));//print employee count number
			System.out.println("1. Regular\n2. Contractor");//print the select of the type of employee
			System.out.print("Enter type of employee:");
			int key=Inputs.inputInteger();//input integer use static method from inputs class
			switch (key) {//switch statement that will run 
			case Regular://case Regular employee type will create an instance of regular in employees[i] and store it in it 
				employees[i]=new Regular();		
				employees[i].readEmployee();
				break;
			case Contractor://case Contractor employee type will create an instance of Contractor in employees[i] and store it in it 
				employees[i]=new Contractor();		
				employees[i].readEmployee();
				break;

			default:
				System.out.println("The Choice that have been selcted is incorrect please Input again");
				i--;
				break;
			}
		}
		
	}
	
	//method that will print the whole array 
	public void printEmployeeDetails() {
		
		for (int i=0;i<employees.length;i++) {
				employees[i].printEmployee();
		}
	}
	
	//method that will only print =================
	public static void printLine() {
		System.out.println("================================================================================");
	}
	
	//method that will print the name of the store and the table shape and using printLine method 
	public static void printTitle(String name) {
		printLine();
		System.out.printf("%30s Store Management System %n",name);
		printLine();
		System.out.printf("%15s|%15s|%15s|%15s|%15s|%n","Employee Number", "Name", "Email","Phone Number","Salary");
		printLine();
		
		
	}

}
