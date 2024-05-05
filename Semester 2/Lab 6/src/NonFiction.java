import java.util.Scanner;

/**
 * Class that read and print the information of NonFiction books
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class NonFiction extends Book{
    //declare private variable that will read nonfiction genre
    private String nonFictiongenre;

    /**
     * method that will read nonfiction genre from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.print("Enter the NonFiction genre :");
        nonFictiongenre=TestInputs.testEmptyString(scan);
    }

    /**
     * method that will read nonfiction genre from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBookFromFile(Scanner scan) {
        super.readBookFromFile(scan);
        nonFictiongenre= scan.next();
    }


    /**
     * Method that will print the info of nonfiction books include nonfiction genre
     */
    @Override
    public void printinfo() {
        System.out.printf("%10d |%30s |%13d |%20s |%15s |%10s |",super.getId(),super.getBookName(),super.getIsbn(),super.getAuthorName(),
        		super.getDateOfPublish(),nonFictiongenre);
    }
}
