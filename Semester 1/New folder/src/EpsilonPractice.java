/*
	 * Assessment: Exercise 07
	 * Student Name:Zahi Masarwa
	 * Due Date: 03/26/21
	 * Description:  
	 * Professor Name:Mel Sanschagrin 
	*/

//ToDo: Programmer comment above the class describing the class
public class EpsilonPractice {

	//ToDo: Programmer comment above method main describing the method
	public static void main(String[] args) {
		
		EpsilonTester epsilonTester = new EpsilonTester();
		final int CONTINUE_PROGRAM = 1; // use this for the loop
		int continueProgram = 0; // for user entry regarding continue program
        String report = ""; // used for outputs
        int choice;
        
		
        // ToDo: Start Loop here either do ... while, or while
		
        do {
        	epsilonTester.interactWithUserForFieldValues();

       		System.out.println();
       		report = epsilonTester.compareWithEquality();
       		System.out.println(report);
       		
       		System.out.println();
       		report = epsilonTester.compareWithEpsilon();
       		System.out.println(report);
       		 System.out.println("Choose 1 to contenue test numbers");
       		System.out.println("Choose 0 to exit program");
       		choice=User.inputInteger();
       		while (choice!=continueProgram && choice!=CONTINUE_PROGRAM) {
       			System.out.println("number that enterned is incorrect please enter again");
       			choice=User.inputInteger();
       		}
       

		} while (choice!=continueProgram);
     

		
		// change the line below to use your full name, rather than "your name"
		System.out.println("Program by Zahi Masarwa");

		// ToDo: Prompt the user if they want to exit program
		//       input their option, only zero exits the program
		//       use the user entry to continue or exit the loop.

		
		System.out.println("Program has exited"); // after loop exits
	}
}
