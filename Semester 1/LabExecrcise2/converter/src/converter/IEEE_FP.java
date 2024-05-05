/* This program demonstartes IEEE 754 floating-point implementation*/
public class IEEE_FP {
 public static void main (String [] args){
  double result;
  result = Math.sqrt(-1);
  System.out.println("The result is: " + result);
  result = 1.0/0.0;
  System.out.println("The result is: " + result);
  result = -1.0/0.0;
  System.out.println("The result is: " + result);
  int iResult;
  iResult = 1/0;
 }
}
/*Expected output
C:\CST8101>java IEEE_FP
The result is: NaN
The result is: Infinity
The result is: -Infinity
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at IEEE_FP.main(IEEE_FP.java:12)
*/