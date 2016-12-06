import org.junit.Assert;
import org.junit.Test;

/**
 * Created by gs on 25.10.2016.
 */
public class MatrixBuilderTest {
    @Test
    public void createMatrix() throws Exception {
        double[] sequence = {1, 2, 3};
        double[][] expectedMatrix = {{1, 2, 3}, {2, 3, 1}, {3, 2, 1}};

        MatrixBuilder matrixBuilder = new MatrixBuilder();
        double[][] resultMatrix = matrixBuilder.createMatrix(sequence);

        for(int i = 0; i < resultMatrix.length; i++){
            Assert.assertArrayEquals(resultMatrix[i], expectedMatrix[i], 0.0001);
        }
    }

}