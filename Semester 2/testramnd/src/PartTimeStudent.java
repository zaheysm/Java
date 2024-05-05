

import java.util.Scanner;



public class PartTimeStudent extends Student{
	double courseTotal;
	double credits;
	
	@Override
	public void readInfo() {//accepts nothing returns nothing	
		Scanner scanner= new Scanner(System.in);//instantiating scanner class
		super.readInfo();
		System.out.print("Enter Total Course Fees: ");
		courseTotal= scanner.nextDouble();
		scanner.close();//end of scanner
		System.out.print("Enter Credit Hours: ");
		credits= scanner.nextDouble();
		
	} 
	
	@Override
	public void printInfo() {	
		super.printInfo();
		System.out.printf("%,6.1f | %4.1f |", courseTotal, credits);
	}

}
