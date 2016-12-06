package taskNine;

import java.awt.*;

/**
 * Created by gs on 26.10.2016.
 */
public class Ball {
    private Color color;
    private double weight;

    public Ball(Color ballColor, double ballWeight){
        color = ballColor;
        weight = ballWeight;
    }

    public Color getColor(){
        return color;
    }

    public double getWeight(){
        return weight;
    }
}
