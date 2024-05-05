package com.Employee.code;
/**
 * Class to hold data main data employee 
 * @author Zahi Masarwa
 *
 */
public class Employee implements Comparable<Employee> {
	
	private int rank;		//hold the rank of the emloyee
	private String firstName;		//hold the first name
	private String lastName;		//hold the last name
	
	/**
	 * constructor to set the employee details 
	 * @param rank the rank of the emloyee 
	 * @param firstName first name of the employee
	 * @param lastName last name of the employee
	 */
	public Employee(int rank,String firstName,String lastName) {
		//set the variables from constructor
		this.rank=rank;		
		this.firstName=firstName;
		this.lastName=lastName;
	}
	/**
	 * Default constructor 
	 */
	public Employee() {
		
	}
	/**
	 * method to return the rank 
	 * @return the rank of the emloyee
	 */
	public int getRank() {
		return rank;		
	}

	/**
	 * method to return the full name of the employee
	 * @return full name
	 */
	public String getName() {
		return firstName+" "+lastName;
	}
	/**
	 * used to set the new rank of the user 
	 * @param rank rank of the user
	 */
	public void setRank(int rank) {
		this.rank=rank;
	}
	
	
    /**
     * method to sort the array
     * @param comparestu object that will rescive the array
     * @return by which item you want to return
     */
	  public int compareTo(Employee employee) {
	        return this.rank - employee.rank;
	    }
}
	
	


