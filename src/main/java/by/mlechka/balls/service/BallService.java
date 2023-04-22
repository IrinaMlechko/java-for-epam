package by.mlechka.balls.service;

import by.mlechka.balls.model.Ball;
import by.mlechka.balls.model.Basket;
import by.mlechka.common.BallColor;

public interface BallService {
    /**
     * Adds a ball to the given basket.
     *
     * @param basket the basket to which the ball is added
     * @param ball   the ball to be added to the basket
     */
    void addBall(Basket basket, Ball ball);

    /**
     * Returns the total weight of all the balls in the given basket.
     *
     * @param basket the basket for which to calculate the total weight
     * @return the total weight of all the balls in the basket
     */
    double getWeight(Basket basket);

    /**
     * Returns the number of balls in the given basket with the specified color.
     *
     * @param basket the basket to search for balls
     * @param color  the color of the balls to count
     * @return the number of balls in the basket with the specified color
     */
    int countBallsByColor(Basket basket, BallColor color);
}
