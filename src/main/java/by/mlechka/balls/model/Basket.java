package by.mlechka.balls.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Basket {
    List<Ball> balls = new ArrayList<>();

    public Basket() {
    }

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
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
        if (balls.size() != basket.balls.size()) {
            return false;
        }
        for (int i = 0; i < balls.size(); i++) {
            if (!balls.get(i).equals(basket.balls.get(i))) {
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
