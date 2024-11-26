package questionthree;

public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = {
                new Ellipse("Ellipse1", 5.0, 3.0),
                new Circle("Circle1", 4.0),
                new Triangle("Triangle1", 3.0, 4.0, 5.0),
                new EquilateralTriangle("EquilateralTriangle1", 6.0)
        };

        // Loop through and print each shape's details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
