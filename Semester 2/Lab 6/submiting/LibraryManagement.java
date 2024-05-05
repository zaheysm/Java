
import java.util.Scanner;

/**
 * Main test class that will call libary class and run every thing threw it
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class LibraryManagement {
    /**
     * main method of the class that will run libary class
     * @param args the main method to run the project
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Name of the library: ");
        String name=TestInputs.testEmptyString(scan);
        Library library = new Library(name);
        int option=0;
        do {
            try {
                System.out.print("1.Read user info from keyboard\n2.Read user info from file\n3.Read book info from Keyboard" +
                        "\n4.Read book from file\n5.Print member list\n6.Print staff list\n7.Print book list\n" +
                        "8.Borrow or return book or list of book by user\n9.Exit");
                System.out.print("\nEnter your option: ");
                option = TestInputs.inputInteger(scan);

                switch (option) {
                    case 1:
                        library.readUserDetail(scan);
                        break;
                    case 2:
                        library.readUserFromFile(scan);
                        break;
                    case 3:
                        library.readBookDetail(scan);
                        break;
                    case 4:
                        library.readBookFromFile(scan);
                        break;
                    case 5:
                        library.printMemberInfo();
                        break;
                    case 6:
                        library.printStaffInfo();
                        break;
                    case 7:
                        library.printBookInfo();
                        break;
                    case 8:
                        System.out.print("1.Borrow Book\n" +
                                "2.Return Book\n" +
                                "3.List of user Books\n" +
                                "Enter your option: ");
                        int choose = TestInputs.inputInteger(scan);

                        switch (choose) {
                            case 1:
                                library.selectUser(scan, choose);
                                break;
                            case 2:
                                library.selectUser(scan, choose);
                                break;
                            case 3:
                                library.selectUser(scan, choose);
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Thank you for using the Program... Good Bye ");
                        break;
                    default:
                        System.out.println("you Entered invalid entry... Please enter again");


                }
            }catch (Exception e){
                System.out.println(e.getMessage()+"General Error");
                scan.nextLine();//clear buffer
            }
        }while(option !=9);
    }
}
