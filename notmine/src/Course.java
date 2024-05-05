



/**
 * CET - CS Academic Level 3
 * Course: CST8130 - Data Structures
 * Professor: 
 * SBA level3
 * @author Algonquin College
 * @author Chaymma tsouli
 *
 */

public class Course {
	
	
	private String courseCode;
	private String name;
	private int enrollment;
	private int waitlist;
	
	
	/**
	 * This is a  parameterized constructor to initialize the course class
	 * @param courseCode This represents the code of the course
	 * @param name this represents the name of the course
	 * @param enrollment this represents the enrollment id of the cours
	 * @param waitlist this represents the waitlist id of the course
	 */
	public Course(String courseCode,String name,int enrollment,int waitlist) {
		
		this.courseCode=courseCode;
		this.name=name;
		this.enrollment=enrollment;
		this.waitlist=waitlist;
	}
	
	/**
	 * This is a no argument-constructor 
	 */
	public Course() {
		
		
	}
	
	
	
	
	/**
	 * This method gets the courseCode of the course
	 * @return the course Code of our course
	 */
	public String getCourseCode() {
		return courseCode;
	}
	
	
	/**
	 * This method gets the name of the course
	 * @return the name of the course
	 */
	public String getName() {
		return name;
		
		
	}
	/**
	 * This method gets the enrollment Id of the course
	 * @return the enrollment number of the course 
	 */
	public int getEnrollment() {
		return enrollment;
	}
	
	
	
	
	
	/**
	 * This method gets the waitlist Id of the course
	 * @return the waitlist number of the course
	 */
	public int getWaitlist() {
		return waitlist;
	}
	
	
	
	
	
	
	

}
