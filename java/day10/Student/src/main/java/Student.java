import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    private String Prn;
    private String name;
    private int age;
    private Course course;
    private LocalDate enrollmentDate;
    private double gpa;
    private String city;


    public Student(String prn, String name, int age, String course, LocalDate enrollmentDate, double gpa, String city) {
        Prn = prn;
        this.name = name;
        this.age = age;
        this.course = Course.valueOf(course);
        this.enrollmentDate = enrollmentDate;
        this.gpa = gpa;
        this.city = city;
    }

    public String getPrn() {
        return Prn;
    }

    public void setPrn(String prn) {
        Prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
