package com.TestClass;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.Employee.code.EmployeesList;
/**
 * Main test class to read the file and input it into the emloyee class
 * @author Zahi Masarwa
 *
 */
public class TestDataMain {

	public static void main(String[] args) {

		EmployeesList emp=new EmployeesList();		//instantiate Class EmployeesList
		String filename = "Employees.csv";		//filename
		Path file = Paths.get(filename);		//read file path
		try (BufferedReader input = Files.newBufferedReader(file)) {		//try to read file content
			String line = null;		//declare empty string
			String fields[];
			while ((line = input.readLine()) != null) {		//loop on the file lines
				fields = line.split(",");
				emp.addEmloyee(Integer.parseInt( fields[0]), fields[1], fields[2]);		//read file into EmployeesList list method addEmloyee
				
			}//while
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		for (int i=5;i>0;i--) {		//loop advance worker rank 5
			emp.promate(i);		//promote the worker with one rank
			emp.displayList();		//print worker list 
			System.out.println();		//print an empty line
		}

	}

}
