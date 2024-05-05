import java.util.Scanner;
/**
 * Class that read and print the information of fiction books like comic and fantasy
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class Fiction extends Book{
    //declare main category of main fiction books
    private String genre;

    /**
     * method that will read the main category of fiction books from keyboard
     * @param scan scanner class parameter
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.print("Enter fiction genre: ");
        genre=TestInputs.testEmptyString(scan);

    }
    /**
     * method that will read the main category of fiction books from file
     * @param scan scanner class parameter
     */
    @Override
    public void readBookFromFile(Scanner scan) {
        super.readBookFromFile(scan);
        this.genre=scan.next();

    }

    /**
     * method will print the main info of fiction books include genre
     */
    @Override
    public void printinfo() {
        System.out.printf("%10d |%30s |%13d |%20s |%15s |%10s |",this.getId(),this.getBookName(),this.getIsbn(),this.getAuthorName(),
                this.getDateOfPublish(),this.genre);
    }
}
