package by.mlechka.balls.service.impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import by.mlechka.balls.common.BallColor;
import by.mlechka.balls.model.Ball;
import by.mlechka.balls.model.Basket;
import by.mlechka.balls.service.BallService;

public class BallServiceImplTest {

    private BallService ballService;

    @Before
    public void setUp() {
        ballService = new BallServiceImpl();
    }

    @Test
    public void testAddBall() {
        Basket basket = new Basket();
        Ball ball = new Ball(1.0, BallColor.RED);
        ballService.addBall(basket, ball);
        assertEquals(1, basket.getBalls().length);
        assertEquals(ball, basket.getBalls()[0]);
    }

    @Test
    public void testGetWeight() {
        Basket basket = new Basket();
        Ball ball1 = new Ball(1.0, BallColor.RED);
        Ball ball2 = new Ball(2.0, BallColor.GREEN);
        Ball ball3 = new Ball(3.0, BallColor.BLUE);
        ballService.addBall(basket, ball1);
        ballService.addBall(basket, ball2);
        ballService.addBall(basket, ball3);
        double expectedWeight = ball1.getWeight() + ball2.getWeight() + ball3.getWeight();
        assertEquals(expectedWeight, ballService.getWeight(basket), 0.001);
    }

    @Test
    public void testCountBallsByColor() {
        Basket basket = new Basket();
        Ball ball1 = new Ball(1.0, BallColor.RED);
        Ball ball2 = new Ball(2.0, BallColor.GREEN);
        Ball ball3 = new Ball(3.0, BallColor.BLUE);
        ballService.addBall(basket, ball1);
        ballService.addBall(basket, ball2);
        ballService.addBall(basket, ball3);
        assertEquals(1, ballService.countBallsByColor(basket, BallColor.RED));
        assertEquals(1, ballService.countBallsByColor(basket, BallColor.GREEN));
        assertEquals(1, ballService.countBallsByColor(basket, BallColor.BLUE));
        assertEquals(0, ballService.countBallsByColor(basket, BallColor.BLACK));
    }
}
