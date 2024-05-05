package study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class study {

	public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        scan.nextLine();
        for (int j=0;j<t;j++){
            String S1="",S2="";
            String S=scan.nextLine();
         
            for (int i=0;i<S.length();i++){
                if (i%2==0){
                    S1=S1+S.charAt(i);
                }
                else{
                    S2=S2+S.charAt(i);
                }
            }
            System.out.print(S1+" ");
            System.out.print(S2);
            System.out.println();
        
        }
        scan.close();*/
		
		/* dictiniry example
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> phonebook=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name,phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            for(String key:phonebook.keySet()){
                System.out.println(key);
                if(key.equals(s)) {
                	System.out.println(phonebook.values());
                	phonebook.get(key);
                	phonebook.containsKey(key)
                }
            }
            
        }
        in.close();*/
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int counter=0;
        int bigcounter=0;
        String s="";
        while(n>0){
            int result=n/2;
            int i=result*2;
            s=s+(n-i);
            if(n-i==1){
                counter++;
                if (bigcounter<=counter) {
                	bigcounter=counter;
                }
            }
            else if(counter>0)
            {
                counter=0;
            }

            n=n/2;
        }
        System.out.println(bigcounter);
        System.out.println("reverse order");
        for (int i=s.length()-1;i>=0;i--) {
        	System.out.print(s.charAt(i));
        }
        System.out.println("\nnormal order");
        System.out.println(s);
        
        scanner.close();
		
		

	}

}
