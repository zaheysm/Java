import java.util.Scanner;

/**
 * class that read and print info of fantasy book type
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class Fantasy extends Fiction{
    //declare variable for fantasy theme
    private String theme;

    /**
     * method that will read fantasy types from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.print("Enter Fantasy Theme: ");
        theme=TestInputs.testEmptyString(scan);
    }
    /**
     * method that will read fantasy types from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBookFromFile(Scanner scan) {
        super.readBookFromFile(scan);
        theme=scan.next();
    }
    /**
     * Method that will print the info of the theme
     */
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("%10s\n",theme);
    }
}
