import java.util.Iterator;
import java.util.Random;

//class thats create arrays and print them in patterns 
public class Numbers {
	private int size,row,col;//declare integers to set the size of the arrays
	private int [] numbers;// declare array 
	private int[][] squares;// declare two-dimensional array
	
	//constructor that take integer size and create a new numbers array in the size of the variable size 
	public Numbers(int size) {
		this.size=size;
		numbers=new int[size];
	}
	
	//constructor that take two integers row and col to create a new two-dimensional squares array in the size of the variables row and col 
	public Numbers(int row,int col) {
		this.col=col;
		this.row=row;
		squares=new int[row][col];
	}
	
	//fill the array numbers in integers from 0-9
	public void generateNumbers() {
		
		for (int i = 0; i<size;i++) {
			numbers[i]=i;	
		}
	}
	
	//print array numbers on the same line
	public void printNumbers() {
		
		for (int i = 0; i<size;i++) {
			System.out.print(numbers[i]+" ");	
		}
	}
	
	//print the positions of the two-dimensional array 
	public void printIndices() {

		for (int i=0;i<squares.length;i++) {
			for (int j=0;j<squares.length;j++) {
				System.out.print(i+","+j+" ");
			}
			System.out.println();
		}
	}
	
	//fill array squares with numbers starts at 10^2 
	public void generateSquares() {
		squares=new int[squares.length-1][];
		for (int i=0;i<squares.length;i++) {
			squares[i]=new int[i+1];
			for (int j=0;j<=i;j++) {
				
				squares[i][j]=(int) Math.pow(((i+1)*10)+j,2);//equation the populate the array in numbers start at 10 to a 100 
			}
		}
		
	}
	
	//print the pattern of the array squares 
	
	public void printSquares() {
		for (int i=0;i<squares.length;i++) {
			for (int j=0;j<squares[i].length;j++) {
				System.out.print(squares[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//print top pattern of stars 
	public void printStarsPattern1() {
		for (int i=0;i<=squares.length;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	
	//print bottom pattern of stars 
	public void printStarsPattern2() {
		for (int i=squares.length-1;i>=0;i--) {
			for (int j=0;j<=i;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
