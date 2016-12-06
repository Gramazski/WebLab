import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 24.10.2016.
 */
public class ExpressionCalcTest {
    @Test
    public void calculateByTheFormula() throws Exception {
        ExpressionCalc expressionTest = new ExpressionCalc();
        //Assert.assertEquals(expressionTest.calculateByTheFormula(-1, -1), -0.086589, 0.0001);
        Assert.assertEquals(expressionTest.calculateByTheFormula(1, -1), 1.5, 0.0001);
    }

}