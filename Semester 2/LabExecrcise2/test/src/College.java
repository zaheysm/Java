/*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/

import java.util.Scanner;

/**
 * Represents a College.
 *
 * @author Chayma Tsouli
 * @version 1.0
 * @since 1.0
 */
public class College {

    /**
     * Represents the college’s name.
     */
    private String name;
    /**
     * Represents the college’s students.
     */
    private Student students[];

    /**
     * Creates an collage with the specified name.
     *
     * @param name The college’s name.
     * @param number The college’s students number.
     */
    public College(String name, int number) {
        this.name = name;
        this.students = new Student[number];
    }

    /**
     * print the college's name and table's header
     */
    public void printTitel() {
        System.out.printf("%s - List of Students\n"
                + "************************************\n"
                + "%15s|\t %15s|\t %15s|\t %15s|\t %20s|   %s|%9s|%9s|\n",
                this.name, "Program", "Student#", "Name", "Email", "Phone", "GPA", "Fees", "Credits");
    }

    /**
     * Reade students information.
     */
    public void readStudentsDetails() {
        Scanner scanner = new Scanner(System.in);
        int studentType;
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":\n"
                    + "===========================");

            System.out.println("1 - Fulltime student\n"
                    + "2 - Parttime Student\n"
                    + "Enter Student type: ");

            studentType = scanner.nextInt();
            
            while(studentType!=1 && studentType!=2){
                System.out.println("Wrong student type");
                System.out.println("1 - Fulltime student\n"
                    + "2 - Parttime Student\n"
                    + "Enter Student type: ");
                studentType = scanner.nextInt();
            }
            if (studentType == 1) {
                students[i] = new FulltimeStudent();
                students[i].readInfo();
            } else if (studentType == 2) {
                students[i] = new ParttimeStudent();
                students[i].readInfo();
            } 
        }
    }

    /**
     * print the students information.
     */
    public void printStudentsDetails() {
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }
    }
}
