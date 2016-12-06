import java.awt.*;

/**
 * Created by gs on 10.10.2016.
 */
public class PointChecker {

    private boolean isBelongToInterval(double minValue, double maxValue, double value){
        if ((value >= minValue) && (value <= maxValue)){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isBelongToRectangle(Point upperLeftPoint, Point bottomRightPoint, Point checkPoint){
        if ((isBelongToInterval(upperLeftPoint.getX(), bottomRightPoint.getX(), checkPoint.getX())) && (isBelongToInterval(bottomRightPoint.getY(), upperLeftPoint.getY(), checkPoint.getY()))){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isBelongTo(Point[] regionPoints, Point checkPoint) throws  ArrayIndexOutOfBoundsException{
        for(int i = 0; i < regionPoints.length; i = i + 2){
            if(isBelongToRectangle(regionPoints[i], regionPoints[i + 1], checkPoint)){
                return true;
            }
        }

        return false;
    }
}
