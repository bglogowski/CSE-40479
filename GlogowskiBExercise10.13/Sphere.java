/*
 * Sphere.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class Sphere extends ThreeDimensionalShape {

    Sphere(double dimension1) {
        super(dimension1);
    }

    public double getArea() {
        return 4.0 * Math.PI * Math.pow(getDimension1(), 2);
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getDimension1(), 3);
    }

    public String getName() {
        return "Sphere";
    }
    
    public String toString() {
        return "radius: " + getDimension1();
    }

}
