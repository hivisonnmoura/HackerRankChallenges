package Tutorial30Days.Arrays2D;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hivisonmoura on 2017-07-09.
 */
public class Main {
    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<>();
        Book harry = new Book("Harry Potter", 827131, 99999);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalog libraryCatalog = new LibraryCatalog(bookCollection);
        libraryCatalog.checkOut("Harry Potter");
        libraryCatalog.nextDay();
        libraryCatalog.nextDay();
        libraryCatalog.checkOut("Harry Potter");
        libraryCatalog.setDay(17);
        libraryCatalog.returnBook("Harry Potter");
        libraryCatalog.checkOut("Harry Potter");

    }
}
