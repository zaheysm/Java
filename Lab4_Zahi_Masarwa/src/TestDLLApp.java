/**
 * main class that add numbers using linked list nodes and print ,delete them
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * Professor: James Mwangi PhD
 * Student Name: Zahi Masarwa
 * Student ID: 040985420
 */

class TestDLLApp {
	public static void main(String[] args) {
		DoublyLinkedList newLL=new DoublyLinkedList();
		//insert at first
		newLL.insertFirst(20);
		newLL.insertFirst(42);
		newLL.insertFirst(63);
		newLL.insertFirst(93);

		//insert at last
		newLL.insertLast(9);
		newLL.insertLast(34);
		newLL.insertLast(51);

		newLL.printForwards();
		newLL.printBackwards();
		newLL.deleteFirstNode();
		newLL.deleteLastNode();
		newLL.searchAndDelete(9);
		newLL.printForwards();
		if(!newLL.insertAfter(20,69)){
			System.out.println("The number to insert after not found ");
		}
		if(!newLL.insertAfter(34,77)){
			System.out.println("The number to insert after not found ");
		}
		newLL.printForwards();
		System.out.println("--------------------------------------------");
		DoublyLinkedGeneric newGenericLL=new DoublyLinkedGeneric();
		//insert at first
		newGenericLL.insertFirst(20);
		newGenericLL.insertFirst(42);
		newGenericLL.insertFirst(63);
		newGenericLL.insertFirst(93);

		//insert at last
		newGenericLL.insertLast(9);
		newGenericLL.insertLast(34);
		newGenericLL.insertLast(51);

		newGenericLL.printForwards();
		newGenericLL.printBackwards();
		newGenericLL.deleteFirstNode();
		newGenericLL.deleteLastNode();
		newGenericLL.searchAndDelete(9);
		newGenericLL.printForwards();
		if(!newGenericLL.insertAfter(20,69)){
			System.out.println("The number to insert after not found ");
		}
		if(!newGenericLL.insertAfter(34,77)){
			System.out.println("The number to insert after not found ");
		}
		newGenericLL.printForwards();

	} // end of main() method
} // end class TestDLLApp
