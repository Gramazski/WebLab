import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 26.10.2016.
 */
public class SequenceMergerTest {
    @Test
    public void getPositionToInsert() throws Exception {
        double[] firstSequence = {2, 4, 5, 7};
        double[] secondSequence = {1, 3, 8, 9};
        int[] resultSequence = {0, 1, 4, 5};

        SequenceMerger sequenceMerger = new SequenceMerger();

        Assert.assertArrayEquals(sequenceMerger.getPositionToInsert(firstSequence, secondSequence), resultSequence);
    }

}