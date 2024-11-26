package questionfour;

public class Circle extends Ellipse {
    // Constructor
    public Circle(String name, double radius) {
        super(name, radius, radius); // Both axes are equal for a circle
    }

    // No additional code needed; inherits everything from Ellipse
}
