package Tutorial30Days.Arrays2D;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hivisonmoura on 2017-07-09.
 */
public class LibraryCatalog {

    Map<String, Book> bookCollection = new HashMap<>();
    private int currentDay = 0;
    private int lengthOfCheckoutPeriod = 7;
    private double initialLateFee = 0.50;
    private double feePerLateDay = 1.00;


    public LibraryCatalog(Map<String, Book> collection) {
        this.bookCollection = collection;
    }

    public LibraryCatalog(Map<String, Book> bookCollection, int currentDay, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.currentDay = currentDay;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public void nextDay() {
        currentDay++;
    }

    public void setDay(int day) {
        currentDay = day;
    }

    public void checkOut(String title) {
        Book book = getBook(title);
        if (book.isCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        } else {
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + ". It is due on day "
                    + (getCurrentDay() + getLengthOfCheckoutPeriod()) + ".");
        }
    }

    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + (getInitialLateFee() + daysLate * getFeePerLateDay())
                    + " because your book is " + daysLate + " days overdue.");
        } else {
            System.out.println("Book returned. Thank you");
        }
        book.setCheckedOut(false, -1);
    }

    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. "
                + "It should back on day " + (book.getDayCheckedOut() + getLengthOfCheckoutPeriod()) + ".");
    }


}
