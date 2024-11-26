package questionthree;

public class Circle extends Ellipse {
    // Constructor
    public Circle(String name, double radius) {
        super(name, radius, radius); // Both axes are equal
    }

    // toString method inherits from Ellipse
}
