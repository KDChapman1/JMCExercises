package com.company;

//exercise 32
//
public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) {
        double dX = this.x - x;
        double dY = this.y - y;
        return (Math.sqrt((dX * dX) + (dY * dY)));
    }

    public double distance() {
        return (this.distance(0, 0));
    }

    public double distance(Point another) {
        return (this.distance(another.getX(), another.getY()));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
