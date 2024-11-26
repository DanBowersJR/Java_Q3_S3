package questionthree;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor
    public Triangle(String name, double side1, double side2, double side3) {
        super(name);
        // Validate if the sides form a triangle
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("The given sides do not form a triangle");
        }
    }

    // Override computeArea
    @Override
    public double computeArea() {
        double s = (side1 + side2 + side3) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Override computePerimeter
    @Override
    public double computePerimeter() {
        return side1 + side2 + side3;
    }

    // Override toString
    @Override
    public String toString() {
        return super.toString() + ", Area: " + computeArea() + ", Perimeter: " + computePerimeter();
    }
}
