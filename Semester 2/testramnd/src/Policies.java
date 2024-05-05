

public interface Policies {
	double maxmarks=100; //donot need to put access specifier public static final because these are by default in interface
	double maxGPA=4.0;
	void calculateGPA(double[] array);//accepts double array of marks

}
