//ToDo: Programmer comments top of file as per lecture notes week 1.

//ToDo: Programmer comment above the class describing the class
public class EpsilonPractice {

	//ToDo: Programmer comment above method main describing the method
	public static void main(String[] args) {
		
		EpsilonTester epsilonTester = new EpsilonTester();
		final int CONTINUE_PROGRAM = 1; // use this for the loop
		int continueProgram = 0; // for user entry regarding continue program
        String report = ""; // used for outputs
		
        // ToDo: Start Loop here either do ... while, or while
		
        epsilonTester.interactWithUserForFieldValues();

		System.out.println();
		report = epsilonTester.compareWithEquality();
		System.out.println(report);
		
		System.out.println();
		report = epsilonTester.compareWithEpsilon();
		System.out.println(report);
		
		// change the line below to use your full name, rather than "your name"
		System.out.println("Program by Your Name");

		// ToDo: Prompt the user if they want to exit program
		//       input their option, only zero exits the program
		//       use the user entry to continue or exit the loop.

		
		System.out.println("Program has exited"); // after loop exits
	}
}
