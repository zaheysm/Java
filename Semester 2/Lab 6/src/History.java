import java.util.Scanner;

/**
 * Class that read and print the information of History books
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class History extends NonFiction{
    // declare variable of history type
    private String HistoryType;

    /**
     * method that will read history types from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.println("Please enter history type: ");
        HistoryType=TestInputs.testEmptyString(scan);
    }
    /**
     * method that will read history types from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBookFromFile(Scanner scan) {
        super.readBookFromFile(scan);
        HistoryType=scan.next();
    }

    /**
     * Method that will print the info of history type
     */
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("%10s\n",HistoryType);
    }

}
