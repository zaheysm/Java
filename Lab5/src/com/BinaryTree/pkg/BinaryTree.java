package com.BinaryTree.pkg;

/**
 * CET - CS Academic Level 3
 * Course: CST8130 - Data Structures
 * Professor: James Mwangi PhD.
 *  class to do binary tree to search the tree for specific tree or print the tree in preorder and postorder
 * @author Algonquin College
 * @author George Kriger
 * @author Zahi Masarwa
 */

public class BinaryTree {
	BinaryTreeNode root = null;		//instantiate tree node to null

	/**
	 * create new node with these contents and insert in the proper location
	 * using BST logic
	 * @param newData the integer value to enter the data to the tree
	 */

	public void insertInTree(int newData) {
		if (root == null)		//is the tree is null
			root = new BinaryTreeNode(newData);		//build a new tree
		else
			root.insert(newData);		//method insert to the tree
	}

	/**
	 * Display tree contents using inorder traversal
	 */
	public void displayInOrder() {
		displayInOrder(root);		//run method displayInOrder sending tree to it
	}

	/**
	 * Start at subtree and display tree contents using inorder traversal
	 * @param subRoot starting location in tree
	 */
	private void displayInOrder(BinaryTreeNode subRoot) {
		if (subRoot == null)		//is the subroot working is empty
			return;		//exit the method
		displayInOrder(subRoot.getLeft());		//start at left side to print
		System.out.print(" " + subRoot.getData() + " ");		//print the data needed
		displayInOrder(subRoot.getRight());		//start on the right size
	}

	/**
	 * Display tree contents using preorder traversal
	 */
	public void displayPrOrder() {

		displayPreOrder(root);		//run method to print the tree preorder
	}

	/**
	 * Start at subtree and display tree contents using Preorder traversal
	 * @param subRoot starting location in tree
	 */
	private void displayPreOrder(BinaryTreeNode subRoot) {
		if (subRoot == null)		//is the subroot working is empty
			return;		//exit the method
		System.out.print(" " + subRoot.getData() + " ");		//print the data needed
		displayPreOrder(subRoot.getLeft());			//start at left side to print
		displayPreOrder(subRoot.getRight());		//start on the right size

	}

	/**
	 *	search in the tree for a key needed
	 * @param key variable to search in the tree
	 * @return	boolean if found or not
	 */
	public boolean search(int key){

		return search(root,key);		//run method to start search
	}

	/**
	 * takes a key and tree node to find the key inside the tree
	 * @param subRoot	starting location in tree
	 * @param key	key to search
	 * @return	boolean if key found or not
	 */
	private boolean search(BinaryTreeNode subRoot,int key) {
		while (subRoot != null && subRoot.getData() != key) {		//loop is the root is not null and key is not equal to data
			if (subRoot.getData() < key)		//is key bigger than data
				subRoot = subRoot.getRight();		//get the right size of the tree
			else if (subRoot.getData() > key)		//is key smaller than data
				subRoot = subRoot.getLeft();		//get the left size of the tree
		}
		if (subRoot == null) {		//is the root is null mean key not found
			System.out.printf("Searching for %d: Not found\n",key);		//print statement key not found
		}
		else if (subRoot.getData() == key){		//is the key found
			System.out.printf("Searching for %d: found\n",key);		//print statement key found
		}

		return false;		//return false
	}


}// class
