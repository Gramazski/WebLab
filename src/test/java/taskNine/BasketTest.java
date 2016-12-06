package taskNine;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

/**
 * Created by gs on 26.10.2016.
 */
public class BasketTest {
    @Test
    public void checkBallsWeight() throws Exception{
        Basket basket = initTestBasket();

        Assert.assertEquals(basket.getBallsWeight(), 6, 0.0001);
    }

    @Test
    public void checkSameColorBallsCount() throws Exception{
        Basket basket = initTestBasket();

        Assert.assertEquals(basket.getBallsCountByColor(Color.BLUE), 2);
    }

    private Basket initTestBasket(){
        Basket basket = new Basket();

        basket.putNewBall(new Ball(Color.BLUE, 1));
        basket.putNewBall(new Ball(Color.BLUE, 3));
        basket.putNewBall(new Ball(Color.BLACK, 2));

        return basket;
    }
}