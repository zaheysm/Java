
public class MetalCubeProgram {

	public static void main(String[] args) {
		final int ENTER_DATA = 1;
		final int REPORT = 2;
		final int EXIT = 0;
		MetalCubeAnalyzer analyzer = new MetalCubeAnalyzer();
		UserInput input = new UserInput();
		
		//TODO:
		// Use a loop (while or do-while) to keep the program running,
		// unless the user enters an option to exit the program e.g. a zero.
		// Inside the loop output a menu to the user using the constants
		// above, also output your full name.
		// input the user option and make a choice:
		// if they want to enter data call the appropriate method on the
		// analyzer.
		// if they want a report call the appropriate method on the analyzer.
		// if they want to exit, print a message thanking them for using the 
		// program, and let the loop terminate normally.
		boolean loop=true;
		while(loop)
		{
			System.out.println("Please enter 1 to add cube dimintion");
			System.out.println("please enter 2 for reprot of the cube");
			System.out.println("please eneter 0 to exit the report");
			int select=input.inputInteger();
			switch (select) 
			{
				case ENTER_DATA:
					analyzer.enterCube();
					break;
				case REPORT:
					analyzer.printReport();
					break;
				case EXIT:
					loop=false;
					break;
				 default:
					 System.out.println("you have selcted the wrong choice plese select the right choice");

			}
			
			
		}
		
	}

}
