package task15;

import taskTwelve.Book;

import java.util.Comparator;

/**
 * Created by gs on 26.10.2016.
 */
public class AuthorTitlePriceBookComparator implements Comparator<Book> {
    public int compare(Book firstBook, Book secondBook){
        int resultCompare = new AuthorTitleBookComparator().compare(firstBook, secondBook);

        if (resultCompare != 0){
            return resultCompare;
        }

        return new PriceBookComparator().compare(firstBook, secondBook);
    }
}
