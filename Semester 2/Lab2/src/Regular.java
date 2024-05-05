//class to calculate Regular wage and most of the information of the employee from Employee the Parent class
public class Regular extends Employee {
	//declare double
	private double salary;
	
	//method that read the information of the employee and overload the method 
	@Override
	public void readEmployee() {
		
		super.readEmployee();// super method to overload it from the parent class and method 
		System.out.print("Enter annual salary:");
		this.salary=Inputs.inputDouble()/12;//input Double use static method from inputs class and divide by to calculate the monthly salary

	}
	//method that override the method from parent class Employee to override and print extra info
	@Override
	public void printEmployee() {
		super.printEmployee();//super method to overload it from the parent class and method 
		System.out.printf("%15.2f|%n",salary);//printf statement print 2 decimal points after the dot
	}
}
	
	


