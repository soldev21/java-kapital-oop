package main.exceptions;

public class Circle {

    private int radius;

    public Circle(int radius) throws Exception {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws Exception {
        if (radius<=0) throw new Exception("Radius of circle must be grater than zero.");
        this.radius = radius;
    }
}
