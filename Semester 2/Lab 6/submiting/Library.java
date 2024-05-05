import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class that will connect between users and books and will allow reading type of user or books and print info
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public class Library {
    //declare private variables that hold library name
    private static String libaryName;
    //declare private variables that hold Users list info
    private ArrayList<User> user=new ArrayList<>();
    //declare private variables that hold Books list info
    private ArrayList<Book> books=new ArrayList<>();

    //declare book Class variable for casting reasons
    private Book book;

    /**
     * public constructor that sets library name
     * @param libaryName get the library name from library management class
     */
    public Library(String libaryName){

        this.libaryName =libaryName;
    }

    /**
     * method that will ask the user what kind of book you want to add and read the info of that book from keyboard
     * @param scan scanner class to read info
     */
    public void readBookDetail(Scanner scan){
        int choice=0;
        do {
            System.out.print("1.Fiction\n2.Non Fiction \n");
            System.out.print("Please Enter type of book:");
            choice=TestInputs.inputInteger(scan);
            int subchoice=0;
            switch (choice){
                case 1:
                    do {
                        System.out.print("1.Comic\n2.Fantasy \n");
                        System.out.print("Please Enter sub type of fiction book:");
                        subchoice = TestInputs.inputInteger(scan);
                        switch (subchoice) {
                            case 1:
                                book = new Comic();
                                break;
                            case 2:
                                book = new Fantasy();
                                break;
                            default:
                                System.out.println("Option choose was incorrect for sub type fiction book... please try again");
                        }
                        books.add(book);
                        book.readBook(scan);
                    }while(subchoice!=1 && subchoice!=2);
                    break;
                case 2:
                    do {
                        System.out.print("1.Science\n2.Biography\n3.History\n");
                        System.out.print("Please Enter sub type of non fiction book:");
                        subchoice = scan.nextInt();
                        switch (subchoice) {
                            case 1:
                                book = new Science();
                                break;
                            case 2:
                                book = new Biography();
                                break;
                            case 3:
                                book=new History();
                                break;
                            default:
                                System.out.println("Option choose was incorrect for sub type non fiction book... please try again");
                        }
                        books.add(book);
                        book.readBook(scan);
                    }while(subchoice!=1 && subchoice!=2 && subchoice!=3);
                    break;
                default:
                    System.out.println("Option Entered is incorrect for book type... please try again ");
                    break;
            }
        }while(choice!=1 && choice!=2);
    }

    /**
     * method that will ask the user what kind of user you want to add and read the info of that user from keyboard
     * @param scan scanner class to read info
     */
    public void readUserDetail(Scanner scan) {
        int choice=0;
        do{
            System.out.println("1.Staff\n2.Member");
            System.out.print("Please Enter User want to add: ");
            choice=TestInputs.inputInteger(scan);
            switch (choice){
                case 1:
                    User staff=new Staff();
                    user.add(staff);
                    staff.readInfo(scan);
                    break;
                case 2:
                    User member=new Member<>();
                    user.add(member);
                    member.readInfo(scan);
                    break;
                default:
                    System.out.println("User type entered is incorrect... Please enter again");
            }

        }while(choice!=1 && choice!=2);
    }
    /**
     * method that will ask the user what kind of user you want to add and read the info of that user from file
     * @param scan scanner class to read info
     */
    public void readUserFromFile(Scanner scan){
        try{
            scan=new Scanner(Paths.get("Users.txt"));
        }catch(FileNotFoundException nfe){//exception for file not found
            System.out.println("File not found");
        }catch (IOException ioe){//exception for file io
            System.out.println(ioe.getLocalizedMessage());
        }
        char choice=0;
        while(scan.hasNext()) {
            choice = scan.next().charAt(0);
            switch (choice) {
                case 's':
                    User staff = new Staff();
                    user.add(staff);
                    staff.readinfofile(scan);
                    break;
                case 'm':
                    User member = new Member<>();
                    user.add(member);
                    member.readinfofile(scan);
                    break;
            }
        }
    }

    /**
     * method that will ask the user what kind of book you want to add and read the info of that book from file
     * @param scan scanner class to read info
     */
    public void readBookFromFile(Scanner scan) {
        try {
            scan = new Scanner(Paths.get("Books.txt"));
        } catch (FileNotFoundException nfe) {//exception for file not found
            System.out.println("File not found");
        } catch (IOException ioe) {//exception for file io
            System.out.println(ioe.getLocalizedMessage());
        }
        while (scan.hasNext()) {
            char choice = scan.next().charAt(0);
            char subchoice = scan.next().charAt(0);
            switch (choice) {
                case 'f':
                    switch (subchoice) {
                        case 'c':
                            book = new Comic();
                            break;
                        case 'f':
                            book = new Fantasy();
                            break;
                    }
                    books.add(book);
                    book.readBookFromFile(scan);
                    break;
                case 'n':
                    switch (subchoice) {
                        case 's':
                            book = new Science();
                            break;
                        case 'b':
                            book = new Biography();
                            break;
                        case 'h':
                            book = new History();
                            break;

                    }
                    books.add(book);
                    book.readBookFromFile(scan);
                    break;     
            }

        }
    }


    /**
     * class that will promote user to select a user to borrow ,return and print book info by user
     * @param scan scanner class to scan the info needed
     * @param optionToDO it's sets what kind of option user selected
     */
    public void selectUser(Scanner scan,int optionToDO) {
        int choice = 0;
        do {
            System.out.print("1.Search for user by Full Name\n2.Select user from list\n");
            System.out.print("Select option: ");
            choice = TestInputs.inputInteger(scan);
            switch (choice) {//option that the user want to search threw ether by entering full name or by list
                case 1:
                    boolean founduser=false;
                    System.out.println("Enter Full Name that you want to look for");
                    String name = TestInputs.testEmptyString(scan);
                    for (User userlook : user) {
                        if (userlook instanceof Member) {//make sure that it's only members
                            if (userlook.getFullName().equals(name)) {//ask if the name that enter is in the list
                                whatToDo(userlook, scan, optionToDO);//method that will run the appropriate operation to be done
                                founduser=true;
                                break;
                            }
                        }
                    }
                    if (!founduser){//if no user found will get an error
                        System.out.println("#### There is no user in that name ####");
                    }
                    break;
                case 2:
                    int counter = 1;
                    ArrayList<User> array = new ArrayList<>();//local array list that will only get fill with members only
                    for (User userlook : user) {//fill the arraylist in members
                        if (userlook instanceof Member) {//check if it's member
                            System.out.print(counter);
                            userlook.printinfo();//print book info for the user
                            array.add(userlook);//add all member users to array
                            counter++;

                        }
                    }
                    System.out.println();
                    boolean b = true;//boolean variable to end loop
                    do {
                        try {
                            if (counter > 1) {//asks if there are any users in the list

                                System.out.print("select user you want :");
                                int chooseUser = TestInputs.inputInteger(scan);
                                if (chooseUser > counter || chooseUser<0) {//make sure that the user selected the correct info
                                    throw new IllegalAccessException("User Choose is incorrect please chose again");
                                }
                                int index = user.indexOf(array.get(chooseUser - 1));//see which user index it's in user arraylist
                                whatToDo(user.get(index), scan, optionToDO);//run method according to what user selected sending the user

                            } else {
                                System.out.println("### there is no members ###");//error if there no members in the list
                            }
                            b = false;
                        } catch (IllegalAccessException e) {
                            System.out.println(e.getMessage());
                            scan.nextLine();
                        }
                    } while (b);
                    break;
                default:
                    System.out.println("Wrong option entered in the selecting option");//in case selected wrong option
            }
        } while (choice != 1 && choice != 2);
    }

    //private method which take User object Scanner object and integer and accordingly run
    private void whatToDo(User user,Scanner scan,int option){
        switch (option){
            case 1://in case user selected to borrow a book
                borrowBook(user,scan);

                break;
            case 2://in case user selected to return a book
                returnBook(user,scan);
                break;
            case 3://in case selected to print the borrowed books by user
                printUserBookList(user);
                break;
        }
    }

    /**
     * method that will print user book list
     * @param user object of user
     */
    public void printUserBookList(User user){
        ((Member<?>) user).printBookList();

    }

    /**
     * method that will check the books that the user have and remove from the list
     * @param user user object that will be sent to User class
     * @param scan Scanner object sent to user class
     */
    public void returnBook(User user,Scanner scan){
        ((Member<?>) user).returnBook(scan);
    }

    /**
     * method that will sent to user and promote the user to select a book
     * @param user user object that will be sent to User class
     * @param scan Scanner object sent to user class
     */
    public void borrowBook(User user,Scanner scan){
        ((Member<Book>) user).borrowbook(books,scan);
    }

    //method that will print line of stars
    private static void PrintStars() {
    	for (int i=0;i<125;i++) {
    		System.out.print("*");
    	}
    	System.out.println();
    }

    /**
     * method that will print star pattern and the title of library
     */
    public static void printTitle() {
    	PrintStars();
    	System.out.println("\t\t\t\t\t"+libaryName+" Library\t\t\t\t\t\t");
    	PrintStars();
    }

    /**
     * method that will print book titles
     */
    public static void printBookTitles(){
    		
        System.out.printf("%10s |%30s |%13s |%20s |%15s |%10s |%10s","id","book Name","isbn","Author Name","date Of Publish"
        ,"Category","SubCategory\n");
    }

    /**
     * method that will print method member title
     */
    public void printMemberTitle(){
        System.out.printf("%10s | %15s | %20s | %12s|%4s |%6s","Id","Full Name","Email","Phone Number","age","fine\n");
    }

    /**
     * method that will print staff title
     */
    public void printStaffTitle(){
        System.out.printf("%10s | %15s | %20s | %12s|%10s | %10s","Id","Full Name","Email","Phone Number","Floor","Section\n");
    }

    /**
     * method that will print member info
     */
    public void printMemberInfo() {
        if (user.isEmpty()) {//if the list is empty will print empty
            System.out.println("#### There no user to display ####");
        } else {
        	printTitle();
            printMemberTitle();
            boolean emptymember=false;
            for (User user : user) {
                if (user instanceof Member) {
                    user.printinfo();
                    emptymember=true;
                }
            }
            if (!emptymember){
                System.out.println("#### There no Member to display ####");
            }
        }

    }
    /**
     * method that will print Staff info
     */
    public void printStaffInfo() {
        if (user.isEmpty()) {
            System.out.println("#### There no user to display ####");
        } else {
           printTitle();
           printStaffTitle();
           boolean emptyStaff=false;
            for (User user : user) {
                if (user instanceof Staff) {
                    user.printinfo();
                    emptyStaff=true;
                }
            }
            if (!emptyStaff){
                System.out.println("#### There no Member to display ####");
            }
        }

    }
    /**
     * method that will print book info
     */
    public void printBookInfo(){
        if (books.isEmpty()){//if the book list is empty
            System.out.println("#### There no books to display ####");
        }
        else
        {
        	printTitle();//print title
        	printBookTitles();//print book title
            for (Book book:books){
                book.printinfo();
            }
        }
    }


}

