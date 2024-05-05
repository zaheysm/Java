import java.util.Iterator;

/*
	 * Assessment: Assignment04
	 * Student Name:Zahi Masarwa
	 * Due Date: 04/09/21
	 * Description:  program to
	 * Professor Name:Mel Sanschagrin 
*/
public class exercise08 {
	//class that will take an array and print in reverse order and sum the whole array and print the length of it 
	public static void main(String[] args) {
		
		int [] nums = {1,2,3,5,7};
		int sum=0;
		int counter=nums.length-1;
		
		while (counter>=0) {
			System.out.print(nums[counter]+" ");//print the array in reverse order
			sum+=nums[counter];
			counter--;
		}
		System.out.println("\nArrays length is:"+nums.length);
		System.out.println("The total sum of the array is:"+sum);
		System.out.println("Program by Zahi Masarwa");

	}

}
