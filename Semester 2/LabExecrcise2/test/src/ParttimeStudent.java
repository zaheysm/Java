 /*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/ 
import java.util.Scanner;

/**
 * Represents a Part time Student.
 *
 * @author Chayma Tsouli
 * @version 1.0
 * @since 1.0
 */
public class ParttimeStudent extends Student {

    /**
     * Represents the part time student’s total course fee.
     */
    private double courseFeesTotal;
    /**
     * Represents the part time student’s credits.
     */
    private double credits;

    /**
     * Reade a part time student information.
     */
    @Override
    public void readInfo() {
        super.readInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total course fees: ");
        this.courseFeesTotal = scanner.nextDouble();
        System.out.print("Enter credit hours: ");
        this.credits = scanner.nextDouble();
    }

    /**
     * Print a part time student information.
     */
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("%9.2f| %8.2f|\n", this.courseFeesTotal, this.credits);
    }
}
