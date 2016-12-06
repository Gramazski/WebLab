package task15;

import taskTwelve.Book;

import java.util.Comparator;

/**
 * Created by gs on 26.10.2016.
 */
public class AuthorTitleBookComparator implements Comparator<Book> {
    public int compare(Book firstBook, Book secondBook){
        int resultAuthorCompare = new AuthorBookComparator().compare(firstBook, secondBook);

        if (resultAuthorCompare != 0){
            return resultAuthorCompare;
        }

        return new TitleBookComparator().compare(firstBook, secondBook);
    }
}
