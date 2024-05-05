  /*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/
import java.util.Scanner;

/**
 * Represents a Full time Student.
 *
 * @author Chayma Tsouli
 * @version 1.0
 * @since 1.0
 */
public class FulltimeStudent extends Student {

    /**
     * Represents the full time student’s tuition fee.
     */
    private double tuitionFees;

    /**
     * Reade a full time student information.
     */
    @Override
    public void readInfo() {
        super.readInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tuition fees: ");
        this.tuitionFees = scanner.nextDouble();
    }

    /**
     * Print a full time student information.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("%9.2f|\n", this.tuitionFees);
    }
}