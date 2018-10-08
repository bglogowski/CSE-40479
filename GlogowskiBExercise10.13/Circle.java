/*
 * Circle.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class Circle extends TwoDimensionalShape {

    Circle(double dimension1) {
        super(dimension1);
    }

    public double getArea() {
        return Math.PI * (getDimension1() * getDimension1());
    }

    public String getName() {
        return "Circle";
    }
    
    public String toString() {
        return "radius: " + getDimension1();
    }

}