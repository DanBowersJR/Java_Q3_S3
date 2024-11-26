package questionone;

public class Student extends Person {
    protected String myIdNum;  // Student ID Number
    protected double myGPA;    // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);  // Call the Person constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getters and Setters
    public String getIdNum() {
        return myIdNum;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public double getGPA() {
        return myGPA;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
