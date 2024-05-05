import java.util.Scanner;

/**
 * Class that read and print the information of Science books
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class Science extends NonFiction{

    //declare private variable for type of science
    private String typeOfSience;

    /**
     * method that will read science types from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.print("Please enter type of science :");
        typeOfSience=TestInputs.testEmptyString(scan);
    }

    /**
     * method that will read science types from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBookFromFile(Scanner scan) {
        super.readBookFromFile(scan);
        typeOfSience=scan.next();
    }

    /**
     * Method that will print the info of the science type
     */
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("%10s\n",typeOfSience);
    }
}
