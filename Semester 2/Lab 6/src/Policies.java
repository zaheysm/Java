import java.util.Date;
/**
 * Class that will set the polices
 * @author Zahi Masarwa
 * @version 1.0
 * @since 15.6
 */
public interface Policies {
    /**
     * daysToReturn parameter how many days can have the book without getting a fine
     * fine parameter when the user return the book late how much fine will be for each day late
     * bookallowed parameter will allow the user how many books to borrow
     */
    int daysToReturn =14;
    double fine=1;
    int bookallowed=5;

    /**
     * method that will calculate how mandy days he has teh book
     * @param date date of book returning
     */
    void calclateduedate(Date date);
}
