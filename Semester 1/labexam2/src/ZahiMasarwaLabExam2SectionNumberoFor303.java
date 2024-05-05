public class ZahiMasarwaLabExam2SectionNumberoFor303 {
	
	public static void main(String[] args) {
		
		//declare constants
		final int update_Kitchen=303;
		final int report_Kitchen=304;
		final int quit_program=305;
		
		//declare class constructors
		InputUser input=new InputUser();
		KitchenSink kitchensink=new KitchenSink();
		//declare the input choice
		int choice;
		//do while loop to run the program 
		do {
			//outputs the options
			System.out.println("303 to update kitchen sink");
			System.out.println("304 to view kitchen sink report");
			System.out.println("305 to quit program");
			System.out.println("Program by Zahi Masarwa");
			choice=input.inputInteger();
			//switch to lay the option 
			switch (choice) {
			case update_Kitchen:
				System.out.println("Enter manufacturer");
				kitchensink.setManufacturer(input.inputText());//input manufacturer
				System.out.println("Enter material");
				kitchensink.setMaterial(input.inputText());//input material
				System.out.print("Enter capacity");
				kitchensink.setCapacity(input.inputDouble());//input capacity
				break;
			case report_Kitchen:
				System.out.println(kitchensink.createReport());//output report 
				break;
			case quit_program:
				System.out.println("Program quits");//output program quits
				break;
			default:
				System.out.println("Choice enterd is incorrect please enter again");
				break;
			}
			
		} while (choice!=quit_program);//Condition when to quit the program 
		
		
		
		
		
	}

}
