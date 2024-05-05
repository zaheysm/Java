
public class MetalCubeAnalyzer {
	private int countGoodCubes;
	private int countBadCubes;
	private UserInput input = new UserInput();
	
	public void enterCube() {
		// ToDo: Ask the user for cube dimensions
		// set the dimensions into a cube to check
		// tolerance, add to good or bad cube count depending
		// on the tolerance check result.
		MetalCube cube=new MetalCube(); 
		
		System.out.println("Please enter height of the cube");
		cube.setHeight(input.inputDouble());
		System.out.println("Please enter width of the cube");
		cube.setWidth(input.inputDouble());
		System.out.println("Please enter length of the cube");
		cube.setLength(input.inputDouble());
		
		if (cube.isWithinTolerance()) {
			countGoodCubes++;
		}
		else
		{
			countBadCubes++;
		}
		
	}
	
	public void printReport() {
		// ToDo: Print out the counts of good and bad cubes, total cubes,
		// percent good cubes, percent bad cubes.
		// format the output with some text.
		double sum,GoodPercent,BadPercent;
		sum=countGoodCubes+countBadCubes;
		GoodPercent=countGoodCubes/sum*100;
		BadPercent=(countBadCubes/sum)*100;
		
		System.out.println("count of good cubes is:"+countGoodCubes);
		System.out.println("count of bad cubes is:"+countBadCubes);
		System.out.println("count of total cubes is:"+sum);
		System.out.println("the percentage of the good cubes is:"+GoodPercent+"%");
		System.out.println("the percentage of the bad cubes is:"+BadPercent+"%");
		
	}
}
