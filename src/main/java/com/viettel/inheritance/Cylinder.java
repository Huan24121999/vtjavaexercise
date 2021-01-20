package com.viettel.inheritance;

/**
 * represent a Cylinder
 *
 * @author HuanNT
 */
public class Cylinder extends Circle {

    /**
     * the height of the circle
     */
    private double height = 1d;

    /**
     * create a cylinder with the default value
     */
    public Cylinder() {
    }

    /**
     * create a cylinder with the specified cylinder's radius
     *
     * @param radius the cylinder's radius
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * creates a cylinder with the specified cylinder's radius,
     * cylinder's height, cylinder's color
     *
     * @param radius the cylinder's radius
     * @param height the cylinder's height
     * @param color  the cylinder's color
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * gets the cylinder's height
     *
     * @return a double number representing this cylinder's height
     */
    public double getHeight() {
        return height;
    }

    /**
     * sets the cylinder's height
     *
     * @param height the double number containing the cylinder's height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * calculate the volume of the cylinder
     *
     * @return the double number representing the cylinder's volume
     */
    public double getVolume() {
        return super.getArea() * height;
    }
}
