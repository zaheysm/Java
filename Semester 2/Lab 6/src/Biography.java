import java.util.Scanner;

/**
 * Class that read and print the information of Biography books
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class Biography extends NonFiction{
    //declare private variable for biography category
    private String biographyTypes;

    /**
     * method that will read biography types from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBook(Scanner scan) {
        super.readBook(scan);
        System.out.print("Enter biography types: ");
        biographyTypes=TestInputs.testEmptyString(scan);
    }

    /**
     * method that will read biography types from File
     * @param scan Scanner class to scan object
     */
    @Override
    public void readBookFromFile(Scanner scan) {
    	super.readBookFromFile(scan);
        biographyTypes=scan.next();
    }


    /**
     * Method that will print the info of the subcategory
     */
    @Override
    public void printinfo() {
    	super.printinfo();
        System.out.printf("%12s\n",biographyTypes);
    }

}
