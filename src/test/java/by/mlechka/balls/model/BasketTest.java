package by.mlechka.balls.model;

import by.mlechka.balls.common.BallColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest {

        @Test
        public void testBasketConstructor() {
            Ball[] balls = {new Ball(1.0, BallColor.RED), new Ball(2.0, BallColor.BLUE)};
            Basket basket = new Basket(balls);
            assertArrayEquals(balls, basket.getBalls());
        }

        @Test
        public void testBasketGetBalls() {
            Ball[] balls = {new Ball(1.0, BallColor.RED), new Ball(2.0, BallColor.BLUE)};
            Basket basket = new Basket(balls);
            assertArrayEquals(balls, basket.getBalls());
        }

        @Test
        public void testBasketSetBalls() {
            Ball[] balls1 = {new Ball(1.0, BallColor.RED), new Ball(2.0, BallColor.BLUE)};
            Basket basket = new Basket(balls1);

            Ball[] balls2 = {new Ball(3.0, BallColor.GREEN), new Ball(4.0, BallColor.YELLOW)};
            basket.setBalls(balls2);

            assertArrayEquals(balls2, basket.getBalls());
        }

        @Test
        public void testBasketEquals() {
            Ball[] balls1 = {new Ball(1.0, BallColor.RED), new Ball(2.0, BallColor.BLUE)};
            Basket basket1 = new Basket(balls1);

            Ball[] balls2 = {new Ball(1.0, BallColor.RED), new Ball(2.0, BallColor.BLUE)};
            Basket basket2 = new Basket(balls2);

            assertTrue(basket1.equals(basket2));
        }

        @Test
        public void testBasketNotEquals() {
            Ball[] balls1 = {new Ball(1.0, BallColor.RED), new Ball(2.0, BallColor.BLUE)};
            Basket basket1 = new Basket(balls1);

            Ball[] balls2 = {new Ball(3.0, BallColor.GREEN), new Ball(4.0, BallColor.YELLOW)};
            Basket basket2 = new Basket(balls2);

            assertFalse(basket1.equals(basket2));
        }



}
