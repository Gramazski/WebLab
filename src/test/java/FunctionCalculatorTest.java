import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 25.10.2016.
 */
public class FunctionCalculatorTest {
    @Test
    public void calculateByStep() throws Exception {
        double[][] expectedResult = {
                {-3.0, 0.1425},
                {-2.0, 2.1850},
                {-1.0, -1.5574},
                {0.0, 0.0},
                {1.0, 1.5574},
                {2.0, -2.1850},
                {3.0, -0.1425}

        };

        FunctionCalculator tgCalculator = new FunctionCalculator();

        double[][] realTable = tgCalculator.calculateByStep(-3, 3, 1);

        for(int i = 0; i < expectedResult.length; i++){
            Assert.assertArrayEquals(realTable[i], expectedResult[i], 0.0001);
        }
    }

}