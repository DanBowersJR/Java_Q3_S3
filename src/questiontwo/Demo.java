package questiontwo;

public class Demo {
    public static void main(String[] args) {
        // Test the Point class
        Point point = new Point(2.0f, 3.0f);
        System.out.println("Point: " + point); // Should print: Point: (2.0,3.0)

        // Test the MovablePoint class
        MovablePoint movablePoint = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("Before moving: " + movablePoint);

        // Move the MovablePoint
        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
    }
}
