package main.exceptions;

import java.io.IOException;

public class Circle {

    private int radius;

    public Circle(int radius) throws Exception {
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) throws ExceptionA, ExceptionD {
        if (radius<0) throw new ExceptionB("Radius of circle must be grater than zero.");
        if (radius==0) throw new ExceptionC("Radius of circle must be different than zero.");
        if (radius==0) throw new ExceptionD("Radius of circle must be different than zero.");

        this.radius = radius;
    }
}
