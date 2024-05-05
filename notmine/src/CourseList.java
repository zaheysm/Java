
import java.util.LinkedList;

class Node {

	
		/**This variable represents the data item stored in the node   */
		public Course course; // data item
		/**This variable represents the next node stored after a certain node in the list  */
		public Node next; // next node in list
		/**This variable represents the previous node stored after a certain node in the list  */
		public Node previous; // previous node in list
	// -------------------------------------------------------------

		/**
		 * This is a parameterized constructor that store a new number in the list
		 * @param d This is the number to be stored in the list
		 */
		public Node(Course course) // constructor
		{
			this.course=course;
		}

	// -------------------------------------------------------------
		/**
		 * This is a method that displays the data stored in each node in our list
		 */
//		// display this node data
		public void displayNode() {
			System.out.print(course.getCourseCode() +"  "+course.getName()+"\t "+course.getEnrollment() +"\t "+course.getWaitlist()+"\n");
		}
}







public class CourseList {
	
	
	/** This variable represents the first node in our list */
	private Node first;
	/** This variable represents the last node in our list  */
	private Node last;
	LinkedList<Course> course=new LinkedList<Course>();
	Course courseList=new Course();
	
	
	/**
	 * This is a no -argument constructor to initialize the nodes values to null.
	 */
	public CourseList() { //Constructor
		//initialize first node to null
		first = null;
		//initialize last node to null
		last = null;
	}
	
	
	
	
	/**
	 * This method checks if first node is null .
	 * @return true if the first node is null ,otherwise return false.
	 */
	public boolean isEmpty() {
		return first == null;
	}
	
	
	
	
	
	
	
	
	
	
	
	int largestElement() 
	{ 
	    Node head=first;; 
	    // Declare a max variable and initialize 
	    // it with INT_MIN value. 
	    // INT_MIN is integer type and its value 
	    // is -32767 or less. 
	    int max = Integer.MIN_VALUE; 
	  
	    // Check loop while head not equal to NULL 
	    while (head != null)
	    { 
	  
	        // If max is less then head->data then 
	        // assign value of head->data to max 
	        // otherwise node point to next node. 
	        if (max < head.course.getEnrollment()) 
	            max = head.course.getEnrollment(); 
	        head = head.next; 
	    } 
	    return max; 
	}
	  
	
	/**
	 * This method inserts a number at the front of our list as it will be the
	 * new head of our list.
	 * @param num This is the number to be inserted at the front of our list
	 */
	public void insertFirst(String courseNum,String CourseName,int enroll,int waitList) {
		//create a node object
		Course course=new Course(courseNum,CourseName,enroll,waitList);
		Node newNode = new Node(course);
		
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
	 * This method inserts a number at the rear of our list as it will be the
	 * new tail of our list.
	 * @param num This is the number to be inserted at the rear of our list
	 */
	public void insertLast(String courseNum,String CourseName,int enroll,int waitList) {
		Course course=new Course(courseNum,CourseName,enroll,waitList);
		Node newNode = new Node(course);
		if (isEmpty())
			first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}
	
	
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
	
	/**
	 * @param prev_node
	 * @param new_data
	 */
	/*public void insertAfter(Node prev_node, int new_data)
	{
	    // 1. Check if the given Node is null 
	    if (prev_node == null)
	    {
	        System.out.println("The given previous node cannot be null");
	        return;
	    }
	 
	    //2. Allocate the Node &
	   // 3. Put in the data
	    Node new_node = new Node(new_data);
	 
	    // 4. Make next of new Node as next of prev_node 
	    new_node.next = prev_node.next;
	 
	    // 5. make next of prev_node as new_node
	    prev_node.next = new_node;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}