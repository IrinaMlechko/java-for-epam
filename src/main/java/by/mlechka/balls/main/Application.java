package by.mlechka.balls.main;

import by.mlechka.balls.model.Ball;
import by.mlechka.balls.model.Basket;
import by.mlechka.balls.service.BallService;
import by.mlechka.balls.service.impl.BallServiceImpl;
import by.mlechka.common.BallColor;

public class Application {
    public static void main(String[] args) {
        BallService ballService = new BallServiceImpl();

        Ball ball1 = new Ball(1.0, BallColor.BLUE);
        Ball ball2 = new Ball(2.0, BallColor.RED);
        Ball ball3 = new Ball(3.0, BallColor.BLUE);
        Ball ball4 = new Ball(4.0, BallColor.GREEN);

        Basket basket = new Basket();
        ballService.addBall(basket, ball1);
        ballService.addBall(basket, ball2);
        ballService.addBall(basket, ball3);
        ballService.addBall(basket, ball4);

        double totalWeight = ballService.getWeight(basket);
        int blueBallsCount = ballService.countBallsByColor(basket, BallColor.BLUE);

        System.out.println("Basket weight: " + totalWeight);
        System.out.println("Blue balls count: " + blueBallsCount);
    }
}
