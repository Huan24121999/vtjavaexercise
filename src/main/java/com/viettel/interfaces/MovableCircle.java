package com.viettel.interfaces;

/**
 * The class represent a movable circle
 *
 * @author HuanNT
 */
public class MovableCircle implements Movable {

    /**
     * the radius of the circle
     */
    private int radius;

    /**
     * the movable point
     */
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
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
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center.toString() +
                '}';
    }
}
