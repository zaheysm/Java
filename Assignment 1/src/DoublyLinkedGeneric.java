

import jdk.swing.interop.SwingInterOpUtils;

        import javax.swing.*;

/**
 * Processing data using Doubly Generic Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * Professor: James Mwangi PhD
 *          Student Name: Zahi Masarwa
 * 			Student ID: 040985420
 */

//===================== class starts here=============================

/**
 * class node to hold the main data and next and previous
 */
class NodeGeneric<T> {
    public T mData; // data item
    public NodeGeneric<T> next; // next node in list
    public NodeGeneric<T> previous; // previous node in list
// -------------------------------------------------------------

    /**
     * constructor for the class which accept and Generic
     * @param d  a Generic variable to add
     */
    public NodeGeneric(T d) // constructor
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
 * the Dll class for the Generic node which will add,delete and print the list
 */
class DoublyLinkedGeneric<T>{
    public NodeGeneric<T> first; // next node in list
    public NodeGeneric<T> last; // previous node in list

// -------------------------------------------------------------

    /**
     * constructor to initialize the first and last Generic node with null
     */
    public DoublyLinkedGeneric() {
        first = null;
        last = null;
    }

// -------------------------------------------------------------

    /**
     * test if the first Generic node is empty
     * @return	true or false if the first Generic node is empty or not
     */
    public boolean isEmpty() {
        return first == null;		//true if the first Generic node is empty
    }

// -------------------------------------------------------------

    /**
     * method that will insert Generic node in the first of the array
     * @param num get the Generic type to enter
     */
    public void insertFirst(T num) {
        NodeGeneric<T> newNode = new NodeGeneric<T>(num);		//initialize new new node

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
     * @param num get the Generic type to enter
     */
    public void insertLast(T num) {
        NodeGeneric<T> newNode = new NodeGeneric<T>(num);		//initialize new new node
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
     * @param numToFind	the Generic type that you want to insert a new number after
     * @param newNumber the Generic type to insert
     * @return true or false if it was successful
     */
    public boolean insertAfter(T numToFind, T newNumber) { // (assumes non-empty list)
        NodeGeneric<T>  current = first;		//initialize the new node with first
        while (current.mData != numToFind) {		//loop to test if number is in the list
            current = current.next;		//go to the next number
            if (current == null)		//in case is null
                return false;		//retrun false
        }
        NodeGeneric<T>  newNode = new NodeGeneric<T> (newNumber);		//initialize a new node to add

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
     * method to delete the first Generic node
     * @return	the Generic node that removed
     */
    public NodeGeneric<T>  deleteFirstNode() {
        if (isEmpty()) return null;		//if first node is empty return null
        NodeGeneric<T>  removedOne = first;		//initialize the new node with first
        first = first.next;			//the first node will be the next
        return removedOne;		//return the removed node
    }

// -----------------------------------------------// delete last node

    /**
     * method to remove to last Generic node from teh list
     * @return	removed Generic node
     */
    public NodeGeneric<T>  deleteLastNode() {
        NodeGeneric<T>  removedOne = last.previous;		//initialize new new node
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
     * method to search for a Generic type and delete it
     * @param number	Generic type to search
     * @return Generic node that been deleted
     */
    public NodeGeneric<T>  searchAndDelete(T number) {

        NodeGeneric<T>  removedOne = first, prev = null;		// declare 2 nodes and one initialized from the first node

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
    
    public NodeGeneric<T> search(T number) {

        NodeGeneric<T>  removedOne = first, prev = null;		// declare 2 nodes and one initialized from the first node

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
        return removedOne;

    }

// -------------------------------------------display data from first node to last node

    /**
     * print the Generic node in the list
     */
    public void printForwards() {

        if (!isEmpty()) {		//test if first node is not empty
            NodeGeneric<T>  Current=first;		//initialize current node with first
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
     * method to print the Generic node in reverse
     */
    public void printBackwards() {
        if (!isEmpty()) {		//test if first node is not empty

            NodeGeneric<T>  Current = last;		//initialize current node with last
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
