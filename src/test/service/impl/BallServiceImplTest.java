package test.service.impl;

import by.mlechka.array.model.NumbersArray;
import by.mlechka.balls.model.Ball;
import by.mlechka.balls.model.Basket;
import by.mlechka.balls.service.BallService;
import by.mlechka.balls.service.impl.BallServiceImpl;
import by.mlechka.common.BallColor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BallServiceImplTest {
    private BallService ballService;

    @BeforeEach
    void setUp() {
        ballService = new BallServiceImpl();
    }

    @Test
    void addBall_shouldAddBallToBasket() {
        Ball ball = new Ball(2.0, BallColor.RED);
        Basket basket = new Basket();

        ballService.addBall(basket, ball);

        Assertions.assertEquals(1, basket.getBalls().size());
        Assertions.assertEquals(ball, basket.getBalls().get(0));
    }

    @Test
    void getWeight_shouldReturnTotalWeightOfBallsInBasket() {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(2.0, BallColor.RED));
        balls.add(new Ball(1.0, BallColor.BLUE));
        Basket basket = new Basket(balls);

        double totalWeight = ballService.getWeight(basket);

        Assertions.assertEquals(3.0, totalWeight);
    }

    @Test
    void countBallsByColor_shouldReturnNumberOfBallsInBasketWithSpecifiedColor() {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(2.0, BallColor.RED));
        balls.add(new Ball(1.0, BallColor.BLUE));
        balls.add(new Ball(0.5, BallColor.RED));
        Basket basket = new Basket(balls);

        int redBallsCount = ballService.countBallsByColor(basket, BallColor.RED);
        int blueBallsCount = ballService.countBallsByColor(basket, BallColor.BLUE);
        int greenBallsCount = ballService.countBallsByColor(basket, BallColor.GREEN);

        Assertions.assertEquals(2, redBallsCount);
        Assertions.assertEquals(1, blueBallsCount);
        Assertions.assertEquals(0, greenBallsCount);
    }

}
