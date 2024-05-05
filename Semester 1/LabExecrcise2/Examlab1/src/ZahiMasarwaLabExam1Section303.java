/*
	 * Assessment: LabExam 1
	 * Student Name:Zahi Masarwa
	 * Due Date: 02/16/21
	 * Description: Program that takes Kitchen Supplys  
	 * Professor Name:Mel Sanschagrin 
	*/


public class ZahiMasarwaLabExam1Section303 {

	public static void main(String[] args) {
		
		
		KitchenClass kitchensupply=new KitchenClass();
		
		System.out.println("Testing No Argument Constructor, Get, Set methods:");
		kitchensupply.printkithcen();
		
		System.out.println();
		
		System.out.println("Setting Manufacturer: Sinks R Us, Material: stainless steel, capacity: 30.0");
		KitchenClass kitchensupply1=new KitchenClass("Sinks R Us","stainless steel",30.0);
		kitchensupply1.printkithcen();
		
		System.out.println();
		
		System.out.println("Testing Overloaded Constructor Manufacturer: Ceramic Co, Material: ceramic, capacity: 22.2");
		KitchenClass kitchensupply2=new KitchenClass();
		kitchensupply2.setKitchensupply("Ceramic Co", "ceramic", 22.2);
		kitchensupply2.printkithcen();
		
		System.out.println("Program by Zahi Masarwa");
	}

}
