/*
 * Triangle.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class Triangle extends TwoDimensionalShape {

    Triangle(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double getArea() {
        return (getDimension1() * getDimension2()) / 2.0;
    }

    public String getName() {
        return "Triangle";
    }

    public String toString() {
        return "base: " + getDimension1() + ", height: " + getDimension2();
    }

}
