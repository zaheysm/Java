import java.util.Scanner;

public class MainSys {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Milageuseage enterdata=new Milageuseage();
		double distance,fuelefficiency;
		
		System.out.println("Please enter the distance that will be driven:");
		distance=scan.nextDouble();
		
		System.out.println("Please enter fuel efficiency");
		fuelefficiency=scan.nextDouble();
		
		enterdata.setcar(distance, fuelefficiency);
		enterdata.caculateefficncy();
		
		scan.close();
	}

}
