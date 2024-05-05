package dExample1;

import java.io.IOException;
import java.nio.file.*;

/**
 * Based on https://www.logicbig.com/how-to/code-snippets/jcode-java-io-files-walkfiletree.html
 * @author George Kriger
 *
 */

public class WalkFileTreeExample {


    public static void main(String... args) throws IOException {

/*
 * Rather than the more complicated method call used in the original, 
 * will use the simpler method call with only 2 arguments
 */
    	
  			Files.walkFileTree(Paths.get("."),new Visitor() );

    }//main()
}//class
