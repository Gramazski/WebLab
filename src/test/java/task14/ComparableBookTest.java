package task14;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by gs on 26.10.2016.
 */
public class ComparableBookTest {
    @Test
    public void bookSortingTest() throws Exception{
        ComparableBook book1 = new ComparableBook("1", "gs", 10, 1, 1);
        ComparableBook book2 = new ComparableBook("1", "gs", 10, 1, 2);
        ComparableBook book3 = new ComparableBook("1", "gs", 10, 1, 3);
        ComparableBook book4 = new ComparableBook("1", "gs", 10, 1, 4);

        ComparableBook[] resultArray = {book1, book2, book3, book4};
        ComparableBook[] testArray = {book2, book4, book3, book1};

        Arrays.sort(testArray);

        Assert.assertArrayEquals(testArray, resultArray);
    }
}