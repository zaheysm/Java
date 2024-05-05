
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * Class that read and print the information of member ,it's generics class that take generic arrays
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 * @param <T> generic object that used in the arrays
 */
public class Member<T> extends User implements Policies{

    //declare private variables that are used in this class
    private double age;
    private ArrayList<T> booklist=new ArrayList<>();
    private String dateborrowed;
    private double fined;

    /**
     * method that will read member info from keyboard
     * @param scan Scanner class to scan object
     */
    @Override
    public void readInfo(Scanner scan) {
        super.readInfo(scan);
        scan.nextLine();//clean input stream
        System.out.print("Enter Age: ");
        age=TestInputs.testDouble(scan);

    }

    /**
     * method that will read member info from file
     * @param scan Scanner class to scan object
     */
    @Override
    public void readinfofile(Scanner scan) {
        super.readinfofile(scan);
        age=scan.nextDouble();
    }

    /**
     * method that will take array and ask the user what book you would like to borrow in a condition that he haven't borrowed more than 5
     * @param fullBooklist generic list come from libary class
     * @param scan Scanner class to scan object
     */
    public void borrowbook(ArrayList<T> fullBooklist, Scanner scan){
        boolean loop=true;
        while(loop) {
            try {
                if (booklist.size() > bookallowed - 1) {//ask if the user has borrowed more than five books
                    throw new IllegalAccessException("you have borrowed over " + bookallowed + " please return books to be able to borrow");
                } else {
                    int counter = 1;
                    System.out.print("Choose a book to borrow from list bellow:\n");
                    for (T book : fullBooklist) {// print book list for the user
                        if (book instanceof Book) {
                            Book b = (Book) book;
                            System.out.print(counter + " ");
                            b.printinfo();
                            System.out.println();
                            counter++;
                        }
                    }
                    int choice = TestInputs.inputInteger(scan);//choose what book you want to borrow
                    if (choice >counter || choice <0){
                        throw new IllegalAccessException("You choose incorrect option from book list... Please try again!");
                    }
                    booklist.add(fullBooklist.get(choice - 1));//add chosen book to booklist in member
                    System.out.print("Date of the book is borrowed(MM-dd-yyyy): ");
                    SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");//format date
                    Date today=new Date();
                    Date date = formatter.parse(scan.next());
                    if(date.getTime()>today.getTime()) {//make sure date is not bigger than today
                        throw new IllegalArgumentException("Incorrect date Format... Please try again!");
                    }
                    dateborrowed = formatter.format(date);//instantiate variable
                    loop=false;//to exit loop

                }
            } catch (IllegalAccessException e) {
                System.err.println(e.getMessage());
                scan.nextLine();
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }

    }

    /**
     * method that will print list and ask the user what book you want to return and remove if from list
     * @param scan Scanner class to scan object
     */
    public void returnBook(Scanner scan) {
        boolean b = true;
        while (b) {
            try {
                int choose;
                int counter = 1;
                if(booklist.isEmpty()){
                    System.out.println("\n#### User don't have any books borrowed ####\n");
                    break;
                }
                System.out.println("Choose a book to return from list bellow:");
                for (T book : booklist) {
                    Book booklis = (Book) book;
                    System.out.println(counter);
                    booklis.printinfo();
                    counter++;
                }
                choose = TestInputs.inputInteger(scan);
                if (choose > counter || choose < 0) {
                    throw new IllegalAccessException("You choose incorrect option from book list... Please try again!");
                }
                booklist.remove(choose - 1);
                Date today = new Date();
                calclateduedate(today);
                b=false;
            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Method that will print the info of Member and his book list
     */
    @Override
    public void printinfo() {
        super.printinfo();
        System.out.printf("%3.1f |%4.2f \n",age,fined);
        if(booklist.isEmpty()){

        }else {
            System.out.println("Books that user has borrowed ");
            printBookList();
        }

    }
    /**
     * Method that will print the info of Member book list
     */
    public void printBookList() {
        if(booklist.isEmpty()){
            System.out.println("#### User don't have books borrowed ####");
        }else {
            Library.printBookTitles();
            for (T book : booklist) {
                Book booklis = (Book) book;
                booklis.printinfo();
                System.out.println();
            }
        }
    }

    /**
     * method that will calculate the fine when the member don't return the book within 14 days
     * @param today date object
     */
    @Override
    public void calclateduedate(Date today) {
        try{
        SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");//date format
        Date date=formatter.parse(dateborrowed);//format the date
        long diffInMillies = Math.abs(today.getTime() - date.getTime());//calculate the differance
        TimeUnit timeUnit=TimeUnit.DAYS;//converter to days
        long convertodays=timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);//return the differance from milliseconds to days
        if (convertodays>daysToReturn){//if it's biiger than 14 days
            fined=fine*(convertodays-daysToReturn);//return the fine
            System.out.println("you have been fined for not returning the book in time");
            System.out.println("Fine Total is: $"+fined);
        }else {
            fined=0;
            System.out.println("Thank you for returning the book in time");
        }
        }catch (Exception e){
            System.out.println("date Exception in borrowing book");
        }

    }
}
