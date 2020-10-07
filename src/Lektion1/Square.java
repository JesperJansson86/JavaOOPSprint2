package Lektion1;

/**
 * Created by: Jesper Jansson
 * Date: 2020-10-06
 * Time: 10:45
 * Project: JavaOOP-Spring2
 * Copyright: MIT
 */
public class Square implements Figure {
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    protected double side;
    public Square (double side){
        this.side =side;
    }
    public double getArea(){
        return side*side;
    }
    public double getCirc(){
        return side*4;
    }

}
