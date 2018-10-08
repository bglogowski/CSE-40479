/*
 * Square.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class Square extends TwoDimensionalShape {

    Square(double dimension1) {
        super(dimension1, dimension1);
    }

    Square(double dimension1, double dimension2) {
        super(dimension1, dimension2);
    }

    public double getArea() {
        return getDimension1() * getDimension2();
    }

    public String getName() {
        return "Square";
    }
    
    public String toString() {
        return "width: " + getDimension1() + ", height: " + getDimension2();
    }


}
