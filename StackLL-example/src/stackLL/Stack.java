package stackLL;

import java.util.ArrayList;

/**
 * implements typical stack data structure using LL
 * @author George Kriger
 * @param <E> element stored in stack
 */
public class Stack<E>{
	private StackNode<E> topNode;	//first element of LL
	
	/**
	 * create empty stack
	 */
	public Stack() {
		topNode=null;  
	}
	
	/**
	 * determine whether stack is empty
	 * @return true if stack has zero elements
	 */
	public boolean empty() {
		return topNode==null;
	}
	
	/**
	 * add an item to the top of the stack
	 * @param item item to added to stack
	 * @return the item placed on the stack
	 */
	public E push(E item) {
		StackNode<E> newNode = new StackNode<>(item);
		newNode.next = topNode;
		topNode = newNode;
		return item;
	}
	
	/**
	 * remove an item from the top of the stack
	 * @return item
	 */
	public E pop() {
		E stackItem = topNode.item;
		topNode = topNode.next;
		return stackItem;
	}
}//class
