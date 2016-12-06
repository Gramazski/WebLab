/**
 * Created by gs on 10.10.2016.
 */
public class FunctionCalculator {

    private double calculateByTheFunction(double x) {
        return Math.tan(x);
    }

    public double[][] calculateByStep(double minValue, double maxValue, double step) throws ArrayIndexOutOfBoundsException{
        if (step <= 0){
            throw new NullPointerException("Illegal value of step.");
        }
        int length = getNumberOfIterations(minValue, maxValue, step);
        double[][] resultTable = new double[length][2];
        int tableIterator = 0;
        for(double currentValue = minValue; currentValue <= maxValue; currentValue += step, tableIterator++){
            resultTable[tableIterator][0] = currentValue;
            resultTable[tableIterator][1] = calculateByTheFunction(currentValue);
        }
        
        return resultTable;
    }

    private int getNumberOfIterations(double minValue, double maxValue, double step) throws ArithmeticException{
        return (int)Math.round((maxValue - minValue) / step) + 1;
    }

}
