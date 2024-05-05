package dExample2;

import java.io.File;

/**
 * Example of simple directory operations 
 * for version Java7 or less
 * @author George Kriger
 *
 */
public class CurrentDirExample {

	/**
	 * main() showing basic operations
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		File cwd = new File(".");			//cwd is current working directory
		
		System.out.println(cwd.getPath());
		System.out.println(cwd.getAbsolutePath());
		
		File[] fList = cwd.listFiles();
		for(File f:fList)
			System.out.println(f);
	}

}
