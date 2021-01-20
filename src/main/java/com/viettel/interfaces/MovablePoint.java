package com.viettel.interfaces;

/**
 * This class represents a movable point
 *
 * @author HuanNT
 */
public class MovablePoint implements Movable {
    /**
     * x coordinate definition
     */
    int x;

    /**
     * y coordinate definition
     */
    int y;

    /**
     * the speed in the x direction
     */
    int xSpeed;

    /**
     * the speed in the y direction
     */
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
