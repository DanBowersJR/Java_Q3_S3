package questiontwo;

public class Point {
    private float x = 0.0f; // x-coordinate
    private float y = 0.0f; // y-coordinate

    // Default constructor
    public Point() {
    }

    // Constructor with parameters
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter and setter for x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and setter for y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Set both x and y at once
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Get both x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
