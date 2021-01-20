package com.viettel.inheritance;

/**
 * Represents a circle
 *
 * @author HuanNT
 */
public class Circle {
    /**
     * the radius of the circle
     */
    private double radius = 1d;

    /**
     * the color of the circle
     */
    private String color = "red";


    /**
     * create a empty circle with default value of radius and color
     */
    public Circle() {
    }

    /**
     * create a circle with the specified radius
     *
     * @param radius the radius's circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * create a circle with the specified radius and color
     *
     * @param radius the radius's circle
     * @param color  the color's circle
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * gets the radius's circle
     *
     * @return a double value representing the radius's circle
     */
    public double getRadius() {
        return radius;
    }

    /**
     * set the radius's circle
     *
     * @param radius a double number containing the radius's circle
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * gets the color's circle
     *
     * @return a string representing the color's circle
     */
    public String getColor() {
        return color;
    }

    /**
     * set the color's circle
     *
     * @param color a string containing the color's circle
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * calculate the area of this circle
     *
     * @return the result
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * convert this circle object to String
     *
     * @return the result
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
