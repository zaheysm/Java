/*
	 * Assessment:Lab 2
	 * Student Name:Zahi Masarwa
	 * Due Date: 06/06/2021
	 * Description:this program will input and print information about employees and their salary
	 * Professor Name:Karan Kalsi
	*/

//main class that call store class and input store name and number of emloyees 
public class Lab2 {
	//the main method of the class 
	public static void main(String[] args) {
		int num;//declare variable num 
		String StoreName;//declare variable store
		System.out.print("Enter name of the store:"); 
		StoreName=Inputs.inputText();//input the store name use static method from inputs class
		System.out.print("How many employees do you have?");
		num=Inputs.inputInteger();//input integer use static method from inputs class
		Store store=new Store(num); //declare class object 		
		store.readEmployeeDetails(); //call from class Store method readEmployeeDetails() to input employee information
		Store.printTitle(StoreName);// print store name 
		store.printEmployeeDetails();// print employee information that we input it before 
		
		
	}

}
