package task15;

import taskTwelve.Book;

import java.util.Comparator;

/**
 * Created by gs on 26.10.2016.
 */
public class AuthorBookComparator implements Comparator<Book> {
    public int compare(Book firstBook, Book secondBook){
        return firstBook.getAuthor().compareTo(secondBook.getAuthor());
    }
}
