import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.List;



public class study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	char l='y';
		
		if (l!='y' && l!='Y') {
			l++;
		}
		else {
			l--;
		}
		System.out.println(l);
		
		if (6%2==4%2) {
			System.out.println(true);
		}
		
		int i=10;
		while (i<=10) {
			System.out.println(i++);
			
		}*/
		/*
		short num=6;
		
		switch (num) {
		case 7:
			num++;
			break;
		case 6:
			num++;
		case 5:
			num--;
			break;
		case 14:
			
		default:
			num+=2;
			break;
		}
		System.out.println(num);
*/
		/*
		int total=0;
		for(int i=1;i<5;i++) {
			total+=i;
			i++;
		}
		System.out.println (total);
		/*
		int [] nums= {1,2,3,4,5,6};
		System.out.println(nums[1]+nums[3]);
		
		String w="abcde";
		for (int i=0;i<4;i+=2) {
			System.out.println(w.charAt(i));
		}*/
		/*
		int i=10;
		
		while(i>=0) {
			System.out.println(i);
			i--;
		}
		*/
		/*
		int i=10;
		while (i>=0) {
			System.out.println(i);
			i--;
		}*/
		/*
		int total=3;
		
		for (int i=0;i<3;i++) {
			total+=i;
		}
		System.out.println(total);*/
		
		/*
		short num=6;
		
		if (num<=6)
			num++;
		else 
			num--;
		num--;
		System.out.println(num);
		*/
		/*
		int [] array=new int[10];
		for (int i = array.length; i <=0; i--) {
			array[i]=50;
			System.out.println(array[i]);
		}
		*/
		
		
		//A a = (A) new B();
		/*
		 int[] array = new int[10];
		   for (int i = 0; i < array.length; i--){
		      array[i] = 50;
		      System.out.println(array[i]);
		   }
		
		   int[] array = new int[10];
		   for (int i = array.length-1; i >= 0; i--){
		      array[i] = 50;
		   }
		   System.out.println(array[9]);
		   */
		
		//B b=new B();
		/*
		 int[][] array = new int[5][2];
		   System.out.print(array[0].length); */
		
		// A a = new B();
		/* 
		 int[][] array = {
		           { 1, 2, 3},
		           { 4, 5, 6},
		           { 7, 8, 9}
		           };
		   int[] row = array[0];
		   System.out.print(row[1]);
		*/
		//A a = new B();
		/*
		int[][] array = new int[5][2];
		   System.out.print(array.length);
		   */
		/*
		   int[] array = new int[10];
		   for (int i = array.length; i <= 0; i--){
		      array[i] = 50;
		   }
		   System.out.println(array[0]);*/
		
		//new study().printResuls(1,"hello","world");
		/*
		study s=new study();
		s.findsum(1,2,3,4,5);
		

	}
	*/
		/*
	A a=new A();
	//B b=new B();
	if (a instanceof B) {
		System.out.println("B");
	}
	else
	{
		System.out.println("A");
	}
	
	*/
		
		//A a=(B)new A();
		 // A a = new A();
		  //a.doIt();

		
/*	
		  A a = new B();
		    a.doit();
	//B b=new B();	
	/*	byte [][] x = {{1},{2,3,4}};
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i].toString());
			
		}
		// Arraylist<int> mylist;
		 
		
	/*	
		int [] array=new int[10];
		for (int i = 0; i <10; i=i) {
			array[i]=50;
		}
		System.out.println(array[0]);
		/*
	public void findsum(int a,int b,int ...c,int d) {
		int sum=0;
		for (int n:c) {
			sum+=n;
		}
		System.out.println(sum);
	}
	
	/*public void printResuls(int x,String ...y) {
		System.out.println(y[0]);
	}*/
		/*
	public void printResuls(int x,String ...y) {
		System.out.println(y[x-1]);
	}*/
		// aMethod(1,2,3);
		
		//A a=new B();
		
		// byte[][] x = {{1},{2,3,4}};
		 
		// System.out.println(x[0][0]);
		/*
		A a = new B();

		if (a instanceof B){

		    System.out.print("B");

		}else {

		    System.out.print("A");

		}*/
		/*
		int[] array = new int[10];
		for (int i = array.length - 1 ; i >= 0; i--){
		    array[i] = 50;
		}*/
		
	    // B b = new B();
	/*	
		ArrayList<Integer> list1 = new ArrayList<Integer>(); 

		list1.add(new Integer(1)); 

		list1.add(new Integer(2)); 

		list1.add(new Integer(3)); 

		list1.remove(1); 

		System.out.println(list1);*/
		
	     //A b = new B();
		/*
		int[] array = new int[10];
		for (int i = 10; i >= 0; i--){
		    array[i] = 50;
		}*/
		while(true) {
		try {
			Scanner scan=new Scanner(System.in);
	      SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
          Date date = formatter.parse(scan.next());
          Date today=new Date();

          String dateborrowed = formatter.format(date);
          String [] datearray=dateborrowed.split("-");
          for(int i=0;i<datearray.length;i++) {
        	  System.out.println(datearray[i]);
          }
		}catch(Exception e) {
			System.out.println("Error");
		}
		}
		
		/*
		 A a = new A();
		 try {
		 a.doit();
		 }catch (Exception e) {
			 System.out.println("ex");
		 }
		 //System.out.println(a.i);
		   // a.doit();
		
		//List <String> mylist=new ArrayList<String>();
		//B a=new A();
	
		//a.method();
	
		
	}
	/*
	
	static int  x;
	public static void a() {
		int x;
		x=17;
	}
	public static void b() {
		a();
		System.out.println(x);
	}
	
	//int [10] array=new int[];
	

	/*
	public static void aMethod(int... args){

	    System.out.print(args[1]);

	}*/
}
}



