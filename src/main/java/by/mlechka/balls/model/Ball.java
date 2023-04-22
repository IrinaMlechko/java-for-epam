package by.mlechka.balls.model;

import by.mlechka.common.BallColor;

import java.awt.*;
import java.util.StringJoiner;

public class Ball {
    private double weight;
    private BallColor color;

    public Ball (){

    }
    public Ball (double  weight, BallColor color){
        this.weight = weight;
        this.color = color;
    }

    public  double getWeight (){
        return weight;
    }

    public BallColor getColor (){
        return color;
    }

    public void setWeight (double weight){
        if(weight > 0.0){
            this.weight = weight;
        }
    }

    public void setColor (BallColor color){
        this.color = color;
    }

    @Override
    public String toString (){
        return new StringJoiner(", ", Ball.class.getSimpleName() + "[", "]")
                .add("weight=" + weight)
                .add("color=" + color)
                .toString();
    }

    @Override
    public boolean equals (Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Ball ball = (Ball) o;
        return Double.compare(ball.weight, weight) == 0 && color == ball.color;
    }

    @Override
    public int hashCode (){
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }
}
