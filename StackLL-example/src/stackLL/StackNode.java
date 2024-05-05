package stackLL;

class StackNode<E> {
	E item;
	StackNode<E> next;
	/**
	 * @param item element to be stored as data
	 */
	StackNode(E item) {
		this.item = item;
		next=null;
	}
	//don't need get/set. Fields are visible to package.
	
}//class
