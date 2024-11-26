package questionthree;

public class Ellipse extends Shape {
    private double majorAxis; // Major axis (a)
    private double minorAxis; // Minor axis (b)

    // Constructor
    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // Assign largest value to majorAxis and smallest to minorAxis
        if (axis1 >= axis2) {
            this.majorAxis = axis1;
            this.minorAxis = axis2;
        } else {
            this.majorAxis = axis2;
            this.minorAxis = axis1;
        }
    }

    // Override computeArea
    @Override
    public double computeArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    // Override computePerimeter
    @Override
    public double computePerimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - (majorAxis - minorAxis) * (majorAxis - minorAxis));
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
