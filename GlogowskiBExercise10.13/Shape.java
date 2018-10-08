/*
 * Shape.java
 */

/**
 *
 * @author Bryan Glogowski
 */

abstract public class Shape {

    private double dimension1;
    private double dimension2;
    private double dimension3;

    Shape(double dimension1) {
        setRadius(dimension1);
    }

    Shape(double dimension1, double dimension2) {
        setDimension1(dimension1);
        setDimension2(dimension2);
    }

    Shape(double dimension1, double dimension2, double dimension3) {
        setDimension1(dimension1);
        setDimension2(dimension2);
        setDimension3(dimension3);
    }

    public void setDimension1(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getDimension1() {
        return this.dimension1;
    }

    public void setDimension2(double dimension2) {
        this.dimension2 = dimension2;
    }

    public double getDimension2() {
        return this.dimension2;
    }

    public void setDimension3(double dimension3) {
        this.dimension3 = dimension3;
    }

    public double getDimension3() {
        return this.dimension3;
    }

    public void setRadius(double dimension1) {
        this.dimension1 = dimension1;
    }

    public double getRadius() {
        return this.dimension1;
    }

    public abstract String getName();
}
