/*
 * Tetrahedron.java
 */

/**
 *
 * @author Bryan Glogowski
 */

public class Tetrahedron extends ThreeDimensionalShape {

    Tetrahedron(double dimension1, double dimension2, double dimension3) {
        super(dimension1, dimension2, dimension3);
    }

    public double getArea() {
        return 4 * ((getDimension1() * getDimension2()) / 2);
    }

    public double getVolume() {
        return 1 / 3.0 * ((getDimension1() * getDimension2()) / 2) * getDimension3();
    }

    public String getName() {
        return "Tetrahedron";
    }

    public String toString() {
        return "base width: " + getDimension1() + ", base height: " + getDimension2() + ", height: " + getDimension3();
    }

}
