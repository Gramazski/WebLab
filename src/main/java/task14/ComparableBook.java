package task14;

import taskTwelve.Book;

/**
 * Created by gs on 26.10.2016.
 */
public class ComparableBook extends Book implements Comparable<ComparableBook> {
    private int isbn;

    public ComparableBook(String title, String author, int price, int edition, int isbn){
        super(title, author, price, edition);
        this.isbn = isbn;
    }

    public int compareTo(ComparableBook otherBook) {
        return this.isbn - otherBook.isbn;
    }
}
