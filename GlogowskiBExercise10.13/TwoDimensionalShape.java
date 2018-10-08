/*
 * TwoDimensionalShape.java
 */

/**
 *
 * @author Bryan Glogowski
 */

abstract public class TwoDimensionalShape extends Shape {

    TwoDimensionalShape(double dimension1) {
        super(dimension1);
    }

    TwoDimensionalShape(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public abstract double getArea();

}
