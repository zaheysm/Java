import java.util.Scanner;
/**
 * Class that read and print the information of users
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class User extends Person{

    //declare id for users
    private long id;

    /**
     * method that will read users info from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readInfo(Scanner scan) {
        System.out.print("Enter User Id: ");
        id=TestInputs.testLong(scan);
        super.readInfo(scan);
    }

    /**
     * method that will read users info from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readinfofile(Scanner scan) {
        id=scan.nextLong();
        super.readinfofile(scan);

    }

    /**
     * print all info of person include users id
     */
    @Override
    public void printinfo() {
        System.out.printf("%10d | %15s | %20s | %11d |",id,super.getFullName(),super.getEmail(),super.getPhoneNumber());
    }
}
