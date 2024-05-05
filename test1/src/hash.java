
public class hash {
	public static int sumOfDigits(int s) { 
        int sum = 0; 
        while (s != 0) { 
                sum += s % 10; 
                s = s / 10; 
        } 
        return sum; 
}
	
	
	public static void main(String[] args) { 
        int numburs[] = new int[100];
        for (int i=0;i<100;i++) {
        	numburs[i]=(int)Math.floor(Math.random()*(999999-100000+1)+100000);
        }
        System.out.printf("%-20s%-20s%-20s%-20s\n", 
        			"number", "last two digits", 
                        "middle two digits", "last digits of sum"); 

        for(int number: numburs) { 
                System.out.printf("%-20d%-20d%-20d%-20d\n", 
                		number, number % 100, (number / 100) % 100, sumOfDigits(number) % 100); 
        }
        
	}
}
