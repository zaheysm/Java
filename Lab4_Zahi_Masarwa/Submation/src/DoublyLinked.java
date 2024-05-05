import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;

/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * Professor: James Mwangi PhD
 *          Student Name: Zahi Masarwa
 * 			Student ID: 040985420
 */

//===================== class starts here=============================

/**
 * class node to hold the main data and next and previous
 */
class Node {
	public int mData; // data item
	public Node next; // next node in list
	public Node previous; // previous node in list
// -------------------------------------------------------------

	/**
	 * constructor for the class which accept and integer
	 * @param d  an integer to add
	 */
	public Node(int d) // constructor
	{
		mData = d;
	}

// -------------------------------------------------------------

	/**
	 * print the list
	 */
	public void displayNode() {
		System.out.print(mData + " ");
	}
// -------------------------------------------------------------
} // end class Node

//===================== class design starts here =============================

/**
 * the Dll class for the node which will add,delete and print the list
 */
class DoublyLinkedList {
	private Node first;		//hold the first node
	private Node last;		//hold the last node

// -------------------------------------------------------------

	/**
	 * constructor to initialize the first and last node with null
	 */
	public DoublyLinkedList() {
		first = null;
		last = null;
	}

// -------------------------------------------------------------

	/**
	 * test if the first node is empty
	 * @return	true or false if the first node is empty or not
	 */
	public boolean isEmpty() {
		return first == null;		//true if the first node is empty
	}

// -------------------------------------------------------------

	/**
	 * method that will insert node in the first of the array
	 * @param num get the integer to enter
	 */
	public void insertFirst(int num) {
		Node newNode = new Node(num);		//initialize new new node

		if (isEmpty()) {    //test if first node is empty
			last = newNode;        //if it's empty insert the new node to the last
		}
		else {
			first.previous = newNode;		//if it's not empty insert the new node before the first one
		}
		newNode.next = first;		//initialize the next new node to the first
		first = newNode;		//initialize the first node to the new
	}

// -------------------------------------------------------------

	/**
	 * method to insert node to the end of the list
	 * @param num get the integer to enter
	 */
	public void insertLast(int num) {
		Node newNode = new Node(num);		//initialize new new node
		if (isEmpty())		//test if first node is empty
			first = newNode;		 //if it's empty insert the new node to the first
		else {
			last.next = newNode;		//initialize the next new node to the last
			newNode.previous = last;		//initialize the last node to the new
		}
		last = newNode;		//initialize the last node is the new node
	}

	/**
	 * insert newNumber just after number to find
	 * @param numToFind	the number that you want to insert a new number after
	 * @param newNumber the number to insert
	 * @return true or false if it was successful
	 */
	public boolean insertAfter(int numToFind, int newNumber) { // (assumes non-empty list)
		Node current = first;		//initialize the new node with first
		while (current.mData != numToFind) {		//loop to test if number is in the list
			current = current.next;		//go to the next number
			if (current == null)		//in case is null
				return false;		//retrun false
		}
		Node newNode = new Node(newNumber);		//initialize a new node to add

		if (current == last) {		//if the node found in the last node
			newNode.next = null;		//next new node initialized to null
			last = newNode;		//last will be new node
		} else {
			newNode.next = current.next;		//else the next new node will the next of current node

			current.previous = newNode;		//the previous node will be the new node
		}
		newNode.previous = current;		//previous node will be current
		current.next = newNode;		//current next node will be the new one
		return true;		//return true
	}
	
//------------------------------------------------// delete first node

	/**
	 * method to delete the first node
	 * @return	the node that removed
	 */
	public Node deleteFirstNode() {
		if (isEmpty()) return null;		//if first node is empty return null
		Node removedOne = first;		//initialize the new node with first
		first = first.next;			//the first node will be the next
		return removedOne;		//return the removed node
	}

// -----------------------------------------------// delete last node

	/**
	 * method to remove to last node from teh list
	 * @return	removed node
	 */
	public Node deleteLastNode() {
		Node removedOne = last.previous;		//initialize new new node
		if (isEmpty())		//test if first node is empty
			return null;		 //if it's empty insert the new node to the first
		else {
			last.previous = removedOne;		//initialize the previous last to the previous one to remove
			removedOne.previous = last;		//initialize the previous node to the previous last
		}
		last = removedOne;		//finalize the last node with the new last node
		removedOne.next=null;		//remove the last node and make it null
		return removedOne;		//return the removed node

	}


// -------------------------------------------------------------

// -----------------------------------------finds, deletes and returns the node that contains the given int value

	/**
	 * method to search for a number and delete it
	 * @param number	integer to search
	 * @return node that been deleted
	 */
	public Node searchAndDelete(int number) {

		Node removedOne = first, prev = null;		// declare 2 nodes and one initialized from the first node

		if (removedOne != null && removedOne.mData == number) {		//if it found in the first node
			first = removedOne.next; 		// Changed first
			return removedOne;		// return deleted node
		}

		while (removedOne != null && removedOne.mData != number) {		//loop to test if the integer to find is int the array
			prev = removedOne;		//save the node that we are working on
			removedOne = removedOne.next;		//go to next node
		}


		if (removedOne == null)		// If key was not present in linked list
			return removedOne;


		prev.next = removedOne.next;		// Unlink the node from linked list
		return removedOne;

	}

// -------------------------------------------display data from first node to last node

	/**
	 * print the nodes in the list
	 */
	public void printForwards() {

		if (!isEmpty()) {		//test if first node is not empty
			Node Current=first;		//initialize current node with first
			while (Current!=null){		//loop while not empty
				Current.displayNode();		//run display method to display each node
				Current=Current.next;		//next node
			}

		}else{
			System.out.println("List is empty");		// print statement
		}
		System.out.println();		//print a new line

	}

// -------------------------------------------display data from last node  to first node

	/**
	 * method to print the nodes in reverse
	 */
	public void printBackwards() {
		if (!isEmpty()) {		//test if first node is not empty

			Node Current = last;		//initialize current node with last
			while (Current != null) {		//loop while not empty
				Current.displayNode();		//run display method to display each node
				Current = Current.previous;		//previous node
			}
		}else{
			System.out.println("List is empty");		// print statement
		}
		System.out.println();		//print a new line


	}
// -------------------------------------------------------------
} // end class DoublyLinkedList

// ==========================================================
