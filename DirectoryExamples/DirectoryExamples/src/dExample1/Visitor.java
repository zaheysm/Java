package dExample1;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Based on https://www.logicbig.com/how-to/code-snippets/jcode-java-io-files-walkfiletree.html
 * Original uses of an anonymous class. Here it is extracted to a separate class
 * @author George Kriger
 *
 */
public class Visitor implements FileVisitor<Path> {
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("preVisitDirectory: " + dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc)
            throws IOException {
        System.out.println("postVisitDirectory: " + dir);
        return FileVisitResult.CONTINUE;
    }
    
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException {
        System.out.println("visitFile: " + file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc)
            throws IOException {
        System.out.println("visitFileFailed: " + file);
        return FileVisitResult.CONTINUE;
    }

}//class
