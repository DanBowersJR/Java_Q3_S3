package questionfour;

public class Demo {
    public static void main(String[] args) {
        // Create an array of Scalable shapes
        Scalable[] shapes = {
                new Ellipse("Ellipse1", 5.0, 3.0),
                new Circle("Circle1", 4.0),
                new Triangle("Triangle1", 3.0, 4.0, 5.0),
                new EquilateralTriangle("EquilateralTriangle1", 6.0)
        };

        // Print shapes before scaling
        System.out.println("Before Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        scaleAll(shapes, 2.0);

        // Print shapes after scaling
        System.out.println("\nAfter Scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale all shapes
    public static void scaleAll(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }
    }
}
