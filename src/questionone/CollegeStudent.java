package questionone;

public class CollegeStudent extends Student {
    private int year;    // Current year in college
    private String major; // College major

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);  // Call the Student constructor
        this.year = year;
        this.major = major;
    }

    // Getters and Setters
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
}
