package stackArray;

import java.util.ArrayList;

/**
 * implements typical stack data structure using an array
 * @author George Kriger
 * @param <E> element stored in stack
 */
public class Stack<E>{
	private ArrayList<E> stack;
	private int capacity;
	private int top;	//index of the _last_ element of the array
	
	/**
	 * create stack with default size of 16;
	 */
	public Stack() {
		capacity=16;
		top=-1;
		stack = new ArrayList<E>(capacity);
	}

	/**
	 * create stack with initial size
	 * @param capacity size of stack
	 */
	public Stack(int capacity) {
		this.capacity=capacity;
		top=-1;
		stack = new ArrayList<E>(capacity);
	}
	
	/**
	 * determine whether stack is empty
	 * @return true if stack has zero elements
	 */
	public boolean empty() {
		return stack.size() == 0;
	}
	
	/**
	 * add an item to the top of the stack
	 * @param item item to be added to stack
	 * @return the item placed on the stack
	 */
	public E push(E item) {
		stack.add(++top, item); //could use add(item) which adds to the end
		return item;
	}
	
	/**
	 * remove an item from the top of the stack
	 * @return item
	 */
	public E pop() {
		return stack.remove(top--); //could use remove(stack.size()-1)
	}
}//class
