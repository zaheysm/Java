import java.util.Iterator;
import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {
		int n=11;
		
		for (int i=0;i<(n/2)+1;i++) {
			for (int j=0;j<=i*2;j++) {
				System.out.print("*");
			}
			for (int z=((n*2)-(i*4))-3;z>=0;z--) {
				System.out.print(" ");
			} 
			for (int j=0;j<=i*2;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		int i=0;
		for (i=n-2;i>0;i-=2) {
			for (int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			for (int z=0;z<=((n-i)*2)-1;z++) {
				System.out.print(" ");
			}
			for (int j=i;j>0;j--) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		

		
	}
	
	

}
