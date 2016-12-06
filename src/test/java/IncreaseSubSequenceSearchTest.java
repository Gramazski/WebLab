import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 25.10.2016.
 */
public class IncreaseSubSequenceSearchTest {
    @Test
    public void getCountElementsToRemove() throws Exception {
        int[] testSequence = {1, 4, 3, 5, 8, 6, 7};
        int result = 2;

        IncreaseSubSequenceSearch increaseSubSequenceSearch = new IncreaseSubSequenceSearch();

        Assert.assertEquals(increaseSubSequenceSearch.getCountElementsToRemove(testSequence), result);
    }

}