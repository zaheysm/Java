/*
	 * Assessment:Lab 3
	 * Student Name:Chayma Tsouli
	 * Due Date: 06/20/21
	 * Professor Name:Dr. James Mwangi
	*/ 
public interface Policies { // interface

    /**
     * Represents the MAX POSIABLE MARK.
     */
    public static final int MAX_MARKS = 100; // final :constant 
    /**
     * Represents the MAX POSIABLE GPA
     */
    public static final double MAX_GPA = 4.0;

    /**
     * calculate gpa for a student.
     *
     * @param marks A double array which is list of student's marks
     * @return A double representing gpa
     */
    public double calculateGpa(double marks[]);
}

