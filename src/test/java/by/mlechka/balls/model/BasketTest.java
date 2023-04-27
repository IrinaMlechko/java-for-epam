package by.mlechka.balls.model;

import by.mlechka.balls.common.BallColor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketTest {

    @Test
    public void testGetBalls() {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(0.5, BallColor.BLUE));
        balls.add(new Ball(0.7, BallColor.RED));
        Basket basket = new Basket(balls);

        assertEquals(balls, basket.getBalls());
    }

    @Test
    public void testSetBalls() {
        List<Ball> balls1 = new ArrayList<>();
        balls1.add(new Ball(0.5, BallColor.BLUE));
        balls1.add(new Ball(0.7, BallColor.RED));
        Basket basket = new Basket(balls1);

        List<Ball> balls2 = new ArrayList<>();
        balls2.add(new Ball(0.3, BallColor.GREEN));
        basket.setBalls(balls2);

        assertEquals(balls2, basket.getBalls());
    }

    @Test
    public void testEquals() {
        List<Ball> balls1 = new ArrayList<>();
        balls1.add(new Ball(0.5, BallColor.BLUE));
        balls1.add(new Ball(0.7, BallColor.RED));
        Basket basket1 = new Basket(balls1);

        List<Ball> balls2 = new ArrayList<>();
        balls2.add(new Ball(0.5, BallColor.BLUE));
        balls2.add(new Ball(0.7, BallColor.RED));
        Basket basket2 = new Basket(balls2);

        List<Ball> balls3 = new ArrayList<>();
        balls3.add(new Ball(0.5, BallColor.BLUE));
        Basket basket3 = new Basket(balls3);

        assertEquals(basket1, basket2);
        assertEquals(basket1.hashCode(), basket2.hashCode());

        assertEquals(basket1, basket1);
        assertEquals(basket1.hashCode(), basket1.hashCode());

        assertEquals(basket1.equals(basket3), false);
    }
}
