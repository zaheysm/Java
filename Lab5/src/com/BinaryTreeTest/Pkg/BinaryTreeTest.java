package com.BinaryTreeTest.Pkg;

import com.BinaryTree.pkg.BinaryTree;

/**
 * CET - CS Academic Level 3
 * Course: CST8130 - Data Structures
 * Professor: James Mwangi PhD. 
 * @author Algonquin College
 * @author George Kriger
 * @author Zahi Masarwa
 */
public class BinaryTreeTest {

	/**
	 * main() method to test features of com.BinaryTree.pkg.BinaryTree
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();		//instantiate binary tree
		/*
		tree.insertInTree(4);
		tree.insertInTree(10);
		tree.insertInTree(1);
		tree.insertInTree(16);
		tree.insertInTree(22);
		tree.insertInTree(14);
		tree.insertInTree(15);*/
		
		//numbers to instantiate the tree with
		String enterNumbers="26 38 34 33 70 11 25 72 14 51 13 77 6 40 95 84 50 35 31 54 88 74 46 86 57 39 85 80 19 92";
		//make string to array
		String [] numbers=enterNumbers.split(" ");

		for(int i=0;i<numbers.length;i++){
			tree.insertInTree(Integer.parseInt(numbers[i]));		//insert into the tree
		}
		tree.displayInOrder();		//print the tree in order
		System.out.println();		//print empty line
		tree.displayPrOrder();		//print the array pre order
		System.out.println();		// print empty line

		tree.search(26);		// method to search for 26
		tree.search(11);		// method to search for 11
		tree.search(38);		// method to search for 38
		tree.search(100);		// method to search for 100


	}//main()

}// class
