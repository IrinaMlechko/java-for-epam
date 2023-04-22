package by.mlechka.balls.service.impl;

import by.mlechka.balls.service.BallService;
import by.mlechka.balls.model.Ball;
import by.mlechka.balls.model.Basket;
import by.mlechka.common.BallColor;

public class BallServiceImpl implements BallService {

    @Override
    public void addBall(Basket basket, Ball ball) {
        basket.getBalls().add(ball);
    }

    @Override
    public double getWeight(Basket basket) {
        double weight = 0.0;
        for (Ball ball : basket.getBalls()) {
            weight += ball.getWeight();
        }
        return weight;
    }

    @Override
    public int countBallsByColor(Basket basket, BallColor color) {
        int count = 0;
        for (Ball ball : basket.getBalls()) {
            if (ball.getColor() == color) {
                count++;
            }
        }
        return count;
    }
}
