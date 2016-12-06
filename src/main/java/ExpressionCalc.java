

/**
 * Created by gs on 10.10.2016.
 */
public class ExpressionCalc {

    public double calculateByTheFormula(double x, double y) throws ArithmeticException {
        return calculateNumerator(x, y) / calculateDenumerator(x, y) + x;
    }

    private double calculateNumerator(double x, double y){
        return (1 + Math.pow(Math.sin(x + y), 2));
    }

    private double calculateDenumerator(double x, double y) throws ArithmeticException {
        return 2 + Math.abs(x - 2 * x / (1 + Math.pow(x, 2) * Math.pow(y, 2)));
    }
}
