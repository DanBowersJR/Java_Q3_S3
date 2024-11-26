package questionthree;

public abstract class Shape {
    private String name; // Name of the shape

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Abstract methods for area and perimeter
    public abstract double computeArea();
    public abstract double computePerimeter();

    // Override toString to print the name
    @Override
    public String toString() {
        return "Shape: " + name;
    }
}
