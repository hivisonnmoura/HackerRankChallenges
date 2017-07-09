package Tutorial30Days.Arrays2D;

/**
 * Created by hivisonmoura on 2017-07-09.
 */
public class Book {
    private String title;
    private int pageCount;
    private int ISBN;
    private boolean isCheckedOut; // Whether or not the book is checked out
    private int dayCheckedOut = -1;

    public Book(String title, int pageCount, int ISBN) {
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int dayCheckedOut) {
        isCheckedOut = checkedOut;
       setDayCheckedOut(dayCheckedOut);
    }

    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
}
