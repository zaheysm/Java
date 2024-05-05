import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author ahmad
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		CourseList course=new CourseList();
		
		String filename = "Courses.csv";
		Path file = Paths.get(filename);
		try (BufferedReader input = Files.newBufferedReader(file)) {
			String line = null;
			String fields[];
			while ((line = input.readLine()) != null) {
				fields = line.split(",");
				course.insertFirst(fields[0], fields[1], Integer.parseInt( fields[2]),Integer.parseInt( fields[3]));
			}//while
		}
		catch (IOException ioException) {
			System.err.println("Error opening file");
			ioException.printStackTrace();

		} 
		
		
		course.printForwards();
		int max=course.largestElement();
		System.out.println(max);
		

	}

}
