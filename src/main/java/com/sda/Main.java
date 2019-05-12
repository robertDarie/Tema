package com.sda;

import com.sda.shape.AShape;
import com.sda.shape.Circle;
import com.sda.shape.Rectangle;
import com.sda.shape.Square;

public class Main {

    public static void printShape(AShape shape) {
        String message = String.format
                ("%s received has perimeter: %.2f and area: %.2f",
                        shape.getClass().getSimpleName(), shape.getPerimeter(),
                        shape.getArea());
        System.out.println(message);
    }


    public static void main(String[] args) {

        AShape circle = new Circle(2);
        AShape square = new Square(3);
        AShape rectangle = new Rectangle(4,2);

        printShape(circle);
        printShape(square);
        printShape(rectangle);
    }


}


