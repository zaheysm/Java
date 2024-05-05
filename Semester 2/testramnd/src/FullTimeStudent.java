

import java.util.Scanner;

public class FullTimeStudent extends Student { //it is sub class
	double tuitionFees;
	@Override
	public void readInfo() {//accepts nothing returns nothing	
		Scanner scanner= new Scanner(System.in);//instantiating scanner class
		super.readInfo();
		System.out.print("Enter Tuition Fees: ");
		tuitionFees= scanner.nextDouble();
		scanner.close();
	} 
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("%,6.1f |   | \n", tuitionFees );
		
		
		
	}
}
