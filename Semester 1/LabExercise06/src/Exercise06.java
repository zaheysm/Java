import java.util.Scanner;
/*
	 * Assessment: Exercise 05
	 * Student Name:Zahi Masarwa
	 * Due Date: 03/12/21
	 * Description:  
	 * Professor Name:Mel Sanschagrin 
	*/
public class Exercise06 {
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int select,service;
		double cost,costmodTruck,costmodTrain,costmodPlane,weight;
		String shipingMethod="";
		final int truck=1;
		final int train=2;
		final int plane=3;
		service=10;
		costmodTruck=0.1;
	    costmodTrain=0.25;
	    costmodPlane=0.75;
	    cost=0;
	    System.out.println("Please input the weight of the parcel to ship");
	    weight=scan.nextDouble();
	    System.out.println("Enter 1 to ship by truck");
	    System.out.println("Enter 2 to ship by train");
	    System.out.println("Enter 3 to ship by plane");
	    select=scan.nextInt();
	    switch (select) {
	    	case truck:
	    		cost=Math.round(weight*costmodTruck+service);
	    		shipingMethod="Truck";
	    		break;
	    	case train:
	    		cost=Math.round(weight*costmodTrain+service);
	    		shipingMethod="Train";
	    		break;
	    	case plane:
	    		cost=Math.round(weight*costmodPlane+service);
	    		shipingMethod="Plane";
	    		break;
	    	default:
	    		System.out.println("Invalid shipping method selected");
	    }
	    if (cost>0) {
	    	System.out.println("Shipping by"+shipingMethod+" costs:"+cost);
	    }
	    scan.close();
	    System.out.println("Programed by Zahi Masarwa");
	    

	}

}
