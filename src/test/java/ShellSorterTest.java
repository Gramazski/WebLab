import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 26.10.2016.
 */
public class ShellSorterTest {
    @Test
    public void sort() throws Exception {
        double[] unsortedArray = {2, 1, 4, 5, 9, 3};
        double[] sortedArray = {1, 2, 3, 4, 5, 9};

        ShellSorter shellSorter = new ShellSorter();

        Assert.assertArrayEquals(shellSorter.sort(unsortedArray), sortedArray, 0.00001);
    }

}