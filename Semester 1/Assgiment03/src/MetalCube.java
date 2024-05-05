
public class MetalCube {
	private double length; // centimeter
	private double width; // centimeter
	private double height; // centimeter
	private double cubesize=10;
	
	// EPSILON is set at one-tenth of a centimeter, i.e. 
	// less-than-or-equal-to one millimeter.
	private static final double EPSILON = 0.1; 
	
	public MetalCube() {
		this(10,10,10);
	}
	
	public MetalCube(int length, int width, int height) {
		setLength(length);
		setWidth(width);
		setHeight(height);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public boolean isWithinTolerance() {
		boolean result = true;
		// TODO: Determine if each dimension (length, width, height)
		// is within tolerance of 10cm, i.e. within 9.9 to 10.1 using
		// EPSION
		// if all three dimensions are within tolerance return true
		// any any one or more are not within tolerance return false
		// in other words (i.e.), set a value into variable result
		double d1,d2,d3;
		d1=Math.abs(width-cubesize);
		d2=Math.abs(height-cubesize);
		d3=Math.abs(width-cubesize);
		if (d1<=EPSILON && d2<=EPSILON && d3<=EPSILON)
		{
			result = true;
		}
		else {
			result = false;
		}
		
			
		return result;
	}

}
