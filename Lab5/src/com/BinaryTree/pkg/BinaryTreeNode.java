package com.BinaryTree.pkg;

/**
 * CET - CS Academic Level 3
 * Course: CST8130 - Data Structures
 * Professor: James Mwangi PhD. 
 * @author Algonquin College
 * @author George Kriger
 * @author Zahi Masarwa
 *
 */

public class BinaryTreeNode {
	private int data;		//hold the numbers of the tree
	private BinaryTreeNode left;		//hold the left side of the tree
	private BinaryTreeNode right;		//hold the right side of the tree

	/**
	 * Construct new tree node using these contents
	 * @param data contents of node
	 */
	public BinaryTreeNode(int data) {
		left = null;		//instantiate left with null
		right = null;		//instantiate right with null
		this.data = data;		////instantiate data with an integer
	}

	/**
	 * retrieve the contents of the node
	 * @return contents of node
	 */
	public int getData() {
		return data;
	}

	/**
	 * retrieve the reference to the left-hand subtree
	 * @return reference to left subtree
	 */
	public BinaryTreeNode getLeft() {
		return left;
	}

	/**
	 * retrieve the reference to the right-hand subtree
	 * @return reference to right subtree
	 */
	public BinaryTreeNode getRight() {
		return right;
	}

	/**
	 * create new node and insert it in the proper location 
	 * using BST logic
	 * @param newData contents of node which will be inserted
	 */
	public void insert(int newData) {
		if (newData < data) {		//is data smaller of the data entered
			if (left == null)		//is left is null
				left = new BinaryTreeNode(newData);		//instantiate left with new tree traversal to the left
			else
				left.insert(newData);		//insert into traversal left
		} else if (newData > data) {		//is data bigger of the data entered
			if (right == null)		//is right is null
				right = new BinaryTreeNode(newData);		//instantiate left with new tree traversal to the right
			else
				right.insert(newData);		//insert into traversal right
		} else
			System.out.println("Duplicate � not adding" + newData);		//print statement that there is a duplicate
	}// insert()

}// class
