/*
 * ThreeDimensionalShape.java
 */

/**
 *
 * @author Bryan Glogowski
 */

abstract public class ThreeDimensionalShape extends Shape {

    ThreeDimensionalShape(double dimension1) {
        super(dimension1);
    }

    ThreeDimensionalShape(double dimension1, double dimension2, double dimension3) {
        super(dimension1, dimension2, dimension3);
    }

    public abstract double getArea();

    public abstract double getVolume();

}
