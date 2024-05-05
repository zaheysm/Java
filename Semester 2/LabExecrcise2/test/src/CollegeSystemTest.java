 /*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/
import java.util.Scanner;
/**
 * Represents a handler for system.
 *
 * @author Chayma Tsouli
 * @version 1.0
 * @since 1.0
 */
public class CollegeSystemTest { // class 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name of College: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();
        
        College c = new College(name, number);
        c.readStudentsDetails();
        c.printTitel();
        c.printStudentsDetails();
    }
    
}

