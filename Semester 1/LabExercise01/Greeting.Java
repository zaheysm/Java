/*
 * Assessment: Exercise 01 
 * Student Name:Zahi Masarwa
 * Due Date: 01
 * Description: A simple program to output a name and the date and time. 
 * Professor Name:Mel Sanschagrin 
*/

import java.util.Date;
import java.text.DateFormat;

/* A simple class that outputs a greeting to the console. */
public class Greeting{
       /* Entry point for the application. */
        public static void main(String[] args){
        	Date todayDateTime = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(); 
        	System.out.println("Hello, my author's name is " + "Zahi Masarwa");
        	System.out.println("Today is: " + dateFormat.format(todayDateTime));
}}