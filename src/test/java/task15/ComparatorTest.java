package task15;

import org.junit.Assert;
import org.junit.Test;
import taskTwelve.Book;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by gs on 26.10.2016.
 */
public class ComparatorTest {
    private ArrayList<Book> testBooks;

    @Test
    public void TitleComparatorTest() throws Exception{
        ArrayList<Book> sortedTestBooks = new ArrayList<Book>() {{
            add(new Book("A", "Cgs", 3, 4));
            add(new Book("B", "Dgs", 4, 2));
            add(new Book("C", "Bgs", 2, 3));
            add(new Book("D", "Ags", 1, 1));
        }};
        
        initTestArray();

        TitleBookComparator authorBookComparator = new TitleBookComparator();
        Collections.sort(testBooks, authorBookComparator);

        Assert.assertArrayEquals(testBooks.toArray(), sortedTestBooks.toArray());
    }

    @Test
    public void AuthorComparatorTest() throws Exception{
        ArrayList<Book> sortedTestBooks = new ArrayList<Book>() {{
            add(new Book("D", "Ags", 1, 1));
            add(new Book("C", "Bgs", 2, 3));
            add(new Book("A", "Cgs", 3, 4));
            add(new Book("B", "Dgs", 4, 2));
        }};

        initTestArray();

        AuthorBookComparator authorBookComparator = new AuthorBookComparator();
        Collections.sort(testBooks, authorBookComparator);

        Assert.assertArrayEquals(testBooks.toArray(), sortedTestBooks.toArray());
    }

    @Test
    public void AuthorTitleComparatorTest() throws Exception{
        ArrayList<Book> sortedTestBooks = new ArrayList<Book>() {{
            add(new Book("D", "Ags", 1, 1));
            add(new Book("C", "Bgs", 2, 3));
            add(new Book("A", "Cgs", 3, 4));
            add(new Book("B", "Dgs", 4, 2));
        }};

        initTestArray();

        AuthorTitleBookComparator authorTitleBookComparator = new AuthorTitleBookComparator();
        Collections.sort(testBooks, authorTitleBookComparator);

        Assert.assertArrayEquals(testBooks.toArray(), sortedTestBooks.toArray());
    }

    private void initTestArray(){
        testBooks = new ArrayList<Book>() {{
            add(new Book("C", "Bgs", 2, 3));
            add(new Book("A", "Cgs", 3, 4));
            add(new Book("D", "Ags", 1, 1));
            add(new Book("B", "Dgs", 4, 2));
        }};
    }

}