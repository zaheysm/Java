
//class to calculate Contractor wage and most of the information of the employee from Employee class
public class Contractor extends Employee {
	
	//declare two double variable 
	private double hourlyRate,numHours;
	
	//method that read the information of the employee and overload the method
	@Override
	public void readEmployee() {
		
		super.readEmployee();// super method to overload it from the parent class and method 
		System.out.print("Enter hourly rate: ");
		this.hourlyRate=Inputs.inputDouble();// input hourly wage from inputs class and static method 
		System.out.print("Enter number of hours worked:");
		this.numHours=Inputs.inputDouble();//input hourly worked from inputs class and static method 
		
		
	}
	//method that override the method from parent class Employee to override and print extra info
	@Override
	public void printEmployee() {
		super.printEmployee();// super method to overload it from the parent class and method
		double salery=hourlyRate*numHours;
		System.out.printf("%15.2f|%n",salery);//printf statement print 2 decimal points after the dot
	}
	
	

}
