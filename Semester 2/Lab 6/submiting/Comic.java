import java.util.Scanner;

/**
 * method that will read and print book type comic
 * @author Zahi masarwa
 * @version 1.0
 * @since 15.6
 */
public class Comic extends Fiction{
    //declare private variable for comic world
    private String comicWorld;

    /**
     * method that will read comic book sub category from keyboard
     * @param scan scanner class to read info
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.print("Enter Comic World: ");
        comicWorld=TestInputs.testEmptyString(scan);
    }
    /**
     * method that will read comic book sub category from file
     * @param scan scanner class to read info
     */
    @Override
    public void readBookFromFile(Scanner scan) {
        super.readBookFromFile(scan);
        comicWorld=scan.next();
    }

    /**
     * method print info of comic book type
     */
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("%10s\n",comicWorld);
    }
}
