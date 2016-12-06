package task15;

import taskTwelve.Book;

import java.util.Comparator;

/**
 * Created by gs on 26.10.2016.
 */
public class TitleAuthorBookComparator implements Comparator<Book> {
    public int compare(Book firstBook, Book secondBook){
        int resultTitleCompare = new TitleBookComparator().compare(firstBook, secondBook);

        if (resultTitleCompare != 0){
            return resultTitleCompare;
        }

        return new AuthorBookComparator().compare(firstBook, secondBook);
    }
}
