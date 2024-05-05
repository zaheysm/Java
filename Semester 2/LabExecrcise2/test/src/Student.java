/*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/
import java.util.Scanner;

/**
 * Represents a Student.
 *
 * @author Chayma Tsouli
 * @version 1.0
 * @since 1.0
 */
public class Student extends Person implements Policies {

    /**
     * Represents the student’s student number.
     */
    private int studenNumber;
    /**
     * Represents the student’s program name.
     */
    private String programName;
    /**
     * Represents the student’s gpa.
     */
    private double gpa;

    /**
     * Reade a student information.
     */
    @Override
    public void readInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter program name: ");
        programName = scanner.nextLine();
        System.out.print("Enter student number: ");
        studenNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter first name: ");
        firstName=scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName=scanner.nextLine();
        System.out.print("Enter email Id: ");
        emailId=scanner.nextLine();
        System.out.print("Enter phone number: ");
        phoneNumber=scanner.nextLong();
        readMarks();
    }

    /**
     * Print a student information.
     */
    @Override
    public void printInfo() {
        System.out.printf("%15s|\t %15d|\t %15s|\t %15s|\t%20dl|  %1.2f|",
                programName,
                studenNumber,
                firstName + " " + lastName,
                emailId,
                phoneNumber,
                gpa);
    }

    /**
     * calculate gpa for a student.
     *
     * @param marks A double array which is list of student's marks
     * @return A double representing gpa
     */
    @Override
    public double calculateGpa(double[] marks) {
        double gpa = 0;
        for (int i = 0; i < marks.length; i++) {
            gpa += marks[i];
        }

        gpa = ((gpa / (marks.length * MAX_MARKS)) * MAX_GPA);
        return gpa;
    }

    /**
     * Read list of marks
     */
    private void readMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of courses: ");
        int count = scanner.nextInt();
        double marks[] = new double[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter mark " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            while (marks[i] > MAX_MARKS) {
                System.out.println("Invalid mark ! try again");
                System.out.print("Enter mark " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }
        }
        this.gpa = calculateGpa(marks);
    }



}
