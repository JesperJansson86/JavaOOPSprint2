package Lektion1;

/**
 * Created by: Jesper Jansson
 * Date: 2020-10-06
 * Time: 11:07
 * Project: JavaOOP-Spring2
 * Copyright: MIT
 */
public class Triangle implements Figure {
    protected double height;
    protected double width;
    public Triangle(double height, double width){
        setHeight(height);
        setWidth(width);
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double getArea() {
        return (height*width)/2;
    }

    @Override
    public double getCirc() {
        double s = Math.sqrt(Math.pow(height,2)+Math.pow(width/2,2));
        return s*2+width;
    }
}
