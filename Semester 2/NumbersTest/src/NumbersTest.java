/*
	 * Assessment:Lab 1
	 * Student Name:Zahi Masarwa
	 * Due Date: 05/16/21
	 * Description:Program that prints Positions,Squares in a pattern and stars in patterns
	 * Professor Name:Karan Kalsi
	*/

public class NumbersTest {

	public static void main(String[] args) {
		Numbers n1 = new Numbers (10);
		n1.generateNumbers();
		System.out.println("Printing Numbers");
		n1.printNumbers();
		
		Numbers n2 = new Numbers (10, 10);
		System.out.println("\n\nPrinting Positions");
		n2.printIndices();

		n2.generateSquares();

		System.out.println("\n\n\nPrinting Squares in a pattern");
		n2.printSquares();

		System.out.println("\n\n\nPrinting stars in Patterns");
		n2.printStarsPattern1();
		n2.printStarsPattern2();

	}

}
