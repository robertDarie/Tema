package com.sda.shape;

public class Rectangle extends AShape {

    private double bigSide;


    public double getBigSide() {
        return bigSide;
    }

    public double getSmallSide() {
        return smallSide;
    }

    public Rectangle(double bigSide, double smallSide) {
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    private double smallSide;

    public double getArea() {
        return bigSide * smallSide;
    }

    public double getPerimeter() {
        return 2 * bigSide + 2 * smallSide;
    }
}
