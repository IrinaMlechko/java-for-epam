package by.mlechka.balls.model;

import java.util.StringJoiner;

public class Basket {
    Ball[] balls;

    public Basket() {
    }

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public Ball[] getBalls() {
        return balls;
    }

    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Basket basket = (Basket) o;
        if (balls.length != basket.balls.length) {
            return false;
        }
        for (int i = 0; i < balls.length; i++) {
            if (!balls[i].equals(basket.balls[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 17;
        for (Ball ball : balls) {
            long weightBits = Double.doubleToLongBits(ball.getWeight());
            result = 31 * result + (int) (weightBits ^ (weightBits >>> 32));
            result = 31 * result + ball.getColor().hashCode();
        }
        return result;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "Basket(", ")");
        for (Ball ball : balls) {
            joiner.add(ball.toString());
        }
        return joiner.toString();
    }
}
