package com.viettel.objecclass;

/**
 * the class represent a circle
 *
 * @author HuanNT
 */
public class Circle {
    private double radius = 1d;
    private String color = "red";

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
