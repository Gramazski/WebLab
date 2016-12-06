import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 25.10.2016.
 */
public class SimpleNumbersSearchTest {
    @Test
    public void isSimpleNumbers() throws Exception {
        int[] testArray = {1, 2, 4, 5, 8, 11};
        int[] resultArray = {1, 3, 5};

        SimpleNumbersSearch simpleNumbersSearch = new SimpleNumbersSearch();

        Assert.assertArrayEquals(simpleNumbersSearch.isSimpleNumbers(testArray), resultArray);
    }

}