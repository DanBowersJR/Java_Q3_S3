package questionone;

public class Teacher extends Person {
    private String subject;  // Subject the teacher teaches
    private double salary;   // Teacher's annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);  // Call the Person constructor
        this.subject = subject;
        this.salary = salary;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}
