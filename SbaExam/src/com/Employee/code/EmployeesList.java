package com.Employee.code;

import java.util.Arrays;

/**
 * class to hold the emloyee list and print when it called and add a new emlyee
 * @author Zahi Masarwa

 */
public class EmployeesList{
	
	private Employee [] employeeList;		//array to hold the employee
	private int count=0;		//to count on where to add the new employee
	/**
	 * constructor to set the list of the employee
	 */
	public EmployeesList() {
		employeeList=new Employee[11];
	}
	
	/**
	 * method to add employee from the file
	 * @param rank the rank of the employee
	 * @param fName first name of the meloyee
	 * @param lName last name of the employee
	 */
	public void addEmloyee(int rank,String fName,String lName) {
		Employee newEmp=new Employee(rank,fName,lName);		//create an new employee
		employeeList[count]=newEmp;		//add the employee in the sequential mater he entered 
		count++;		//Increment the count of the last place of the array
	}
	
	/**
	 * method will print the list of the employees
	 */
	public void displayList() {
		System.out.printf("[%s]\t%s\n","Rank","Emloyee Name");		//print the title of table employee 
		for (int i=0;i<employeeList.length;i++) {		//loop on the size of the array
			System.out.printf("%d\t%s\n",employeeList[i].getRank(),employeeList[i].getName());		//print the employee
		}
	}
	
	
	/**
	 * method to promote the employee by 1 rank 
	 * @param rank accept the rank that you want to promote 
	 */
	public void promate(int rank) {
		if (rank>0) {		//make sure that rank is bigger than 0


			employeeList[rank].setRank(rank-1);		//set the new ranks on the employee list
			employeeList[rank-1].setRank(rank);
			Arrays.sort(employeeList);
			
		}else {
			System.out.printf("Rank should be bigger than 0");
		}
		
		
	}
	
	
	
	

}