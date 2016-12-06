import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by gs on 24.10.2016.
 */
public class PointCheckerTest {
    @Test
    public void isBelongTo() throws Exception {
        Point[] testPoints = {new Point(-4, 5), new Point(4, 0), new Point(-6, 0), new Point(6, -3)};
        PointChecker checker = new PointChecker();
        Assert.assertEquals(checker.isBelongTo(testPoints, new Point(3, 3)), true);
    }

}