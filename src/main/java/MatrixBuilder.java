/**
 * Created by gs on 10.10.2016.
 */
public class MatrixBuilder {

    public double[][] createMatrix(double[] sequence){
        double[][] matrix = new double[sequence.length][sequence.length];

        for(int i = 0; i < sequence.length; i++){
            for(int j = 0; j < sequence.length; j++){
                matrix[i][j] = sequence[getNumberOfSequenceElement(i, j, sequence.length)];
            }
        }

        return matrix;
    }

    private int getNumberOfSequenceElement(int i, int j, int sequenceLength){
        if(i + j - 1 > sequenceLength){
            return i + j - 1 - sequenceLength;
        }
        else {
            return i + j - 1;
        }
    }
}
