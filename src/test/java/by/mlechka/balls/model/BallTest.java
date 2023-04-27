package by.mlechka.balls.model;

import by.mlechka.balls.common.BallColor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {

    @Test
    public void testGetColor() {
        Ball ball = new Ball(0.5, BallColor.BLUE);
        assertEquals(BallColor.BLUE, ball.getColor());
    }

    @Test
    public void testGetWeight() {
        Ball ball = new Ball(0.5, BallColor.BLUE);
        assertEquals(0.5, ball.getWeight(), 0.01);
    }

    @Test
    public void testEquals() {
        Ball ball1 = new Ball(0.5, BallColor.BLUE);
        Ball ball2 = new Ball(0.5, BallColor.BLUE);
        Ball ball3 = new Ball(0.7, BallColor.BLUE);
        Ball ball4 = new Ball(0.5, BallColor.RED);

        assertEquals(ball1, ball2);
        assertEquals(ball1.hashCode(), ball2.hashCode());

        assertEquals(ball1, ball1);
        assertEquals(ball1.hashCode(), ball1.hashCode());

        assertEquals(ball1.equals(ball3), false);
        assertEquals(ball1.equals(ball4), false);
    }
}
