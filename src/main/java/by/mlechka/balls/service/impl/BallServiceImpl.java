package by.mlechka.balls.service.impl;

import by.mlechka.balls.service.BallService;
import by.mlechka.balls.model.Ball;
import by.mlechka.balls.model.Basket;
import by.mlechka.balls.common.BallColor;

public class BallServiceImpl implements BallService {

    @Override
    public void addBall(Basket basket, Ball ball) {
        Ball[] currentBalls = basket.getBalls();
        int newLength = currentBalls == null ? 1 : currentBalls.length + 1;
        Ball[] newBalls = new Ball[newLength];
        if (currentBalls != null) {
            for (int i = 0; i < currentBalls.length; i++) {
                newBalls[i] = currentBalls[i];
            }
        }
        newBalls[newLength - 1] = ball;
        basket.setBalls(newBalls);
    }

    @Override
    public double getWeight(Basket basket) {
        double weight = 0.0;
        Ball[] currentBalls = basket.getBalls();
        if (currentBalls != null) {
            for (Ball ball : currentBalls) {
                weight += ball.getWeight();
            }
        }
        return weight;
    }

    @Override
    public int countBallsByColor(Basket basket, BallColor color) {
        int count = 0;
        Ball[] currentBalls = basket.getBalls();
        if (currentBalls != null) {
            for (Ball ball : currentBalls) {
                if (ball.getColor() == color) {
                    count++;
                }
            }
        }
        return count;
    }

}
