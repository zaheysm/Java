import java.util.Scanner;
/**
 * Class that read and print the information of staff
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class Staff extends User{

    //declare private variables for floor and section of the staff
    private String floor;
    private String section;

    /**
     * method that will read staff info from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readInfo(Scanner scan) {

        super.readInfo(scan);
        System.out.print("Enter floor staff works in: ");
        floor=TestInputs.testEmptyString(scan);
        System.out.print("Enter section staff works in: ");
        section=TestInputs.testEmptyString(scan);

    }

    /**
     * method that will read staff info from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readinfofile(Scanner scan) {
        super.readinfofile(scan);
        floor= scan.next();
        section=scan.next();
    }

    /**
     * Method that will print the info of staff
     */
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("%10s | %10s\n",floor,section);

    }

}
