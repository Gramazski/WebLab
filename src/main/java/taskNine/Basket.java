package taskNine;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by gs on 26.10.2016.
 */
public class Basket {
    private ArrayList<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public Basket(ArrayList<Ball> balls){
        this.balls = balls;
    }

    public boolean putNewBall(Ball ball){
        if (ball != null){
            balls.add(ball);
            return true;
        }
        else {
            return false;
        }
    }

    public double getBallsWeight(){
        double commonWeight = 0;

        for (Ball ball : balls){
            commonWeight += ball.getWeight();
        }

        return commonWeight;
    }

    public int getBallsCountByColor(Color color){
        int ballsCount = 0;

        for (Ball ball : balls){
            if (ball.getColor() == color){
                ballsCount++;
            }
        }

        return ballsCount;
    }
}
