package questiontwo;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f; // Speed in x-direction
    private float ySpeed = 0.0f; // Speed in y-direction

    // Default constructor
    public MovablePoint() {
        super(); // Calls the default constructor of Point
    }

    // Constructor with parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Initialize x and y from Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter and Setter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter and Setter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Set both speeds
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Get both speeds as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move method
    public MovablePoint move() {
        setX(getX() + xSpeed); // Update x using Point's getter and setter
        setY(getY() + ySpeed); // Update y using Point's getter and setter
        return this;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
