
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Class that will gather all the main info of book and read it
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public abstract class Book {

    //Declare private variables that will read inside this method
    private long id;
    private String bookName;
    private long isbn;
    private String authorName;
    private String dateOfPublish;

    /**
     * method that will read the main info of book from keyboard
     * @param scan scanner class parameter
     */
    public void readBook(Scanner scan) {
        System.out.print("Enter Book Id: ");
        id = TestInputs.testLong(scan);
        System.out.print("Enter Book Name: ");
        bookName = TestInputs.testEmptyString(scan);
        System.out.print("Enter Isbn: ");
        isbn = TestInputs.testLong(scan);
        System.out.print("Enter Author Name: ");
        authorName = TestInputs.testEmptyString(scan);
        boolean b = true;
        while (b) {
            try {
                System.out.print("Enter date of book publish(MM-dd-yyyy) :");
                SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");//formats the date as needed
                Date date;//date variable
                Date today = new Date();//date variable for today date
                date = formatter.parse(scan.nextLine());//read date from user
                if (date.getTime() > today.getTime()) {//make sure that the dat isn't bigger than today date
                    throw new IllegalArgumentException("Incorrect date Format");//throw exception if inccorect date put in
                }
                dateOfPublish = formatter.format(date);//format the date
                b = false;//close the loop if every thing passed with no exceptions
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println("Date input was wrong format");
            }
        }
    }

    /**
     * method that will read the main info of book from File
     * @param scan scanner class parameter
     */
    public void readBookFromFile(Scanner scan){

        id=scan.nextLong();
        bookName=scan.next().replace('+',' ');
        isbn=scan.nextLong();
        authorName=scan.next().replace('+',' ');
        try {
            SimpleDateFormat formatter= new SimpleDateFormat("MM-dd-yyyy");
            Date date = formatter.parse(scan.next());
            dateOfPublish=formatter.format(date);
        }catch (Exception e){
            System.out.println("Date input was wrong format");
        }

    }

    /**
     * method that will print book info
     */
    abstract public void printinfo();

    /**
     * method that return book id
     * @return book id
     */
    public long getId() {
        return id;
    }

    /**
     * method that return book name
     * @return book name
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * method return the isbn of the book
     * @return isbn
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * method returns author name
     * @return author name
     */
    public String getAuthorName() {
        return authorName;
    }

    /**
     * method that will return publish date of book
     * @return publish date
     */
    public String getDateOfPublish() {
        return dateOfPublish;
    }


}
