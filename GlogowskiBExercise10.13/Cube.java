/*
 * Cube.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class Cube extends ThreeDimensionalShape {

    Cube(double dimension1) {
        super(dimension1);
    }

    public double getArea() {
        return Math.pow(getDimension1(), 3) * 2;
    }

    public double getVolume() {
        return Math.pow(getDimension1(), 3);
    }

    public String getName() {
        return "Cube";
    }
    
    public String toString() {
        return "width: " + getDimension1() + ", height: " + getDimension2()+ ", depth: " + getDimension3();
    }


}
