package StudentProblem;

import java.time.LocalDate;

public class Student {

    private String pnr;
    private String name;
    private int age;
    private Course course;
    private LocalDate enrolldate;
    private double gpa;
    private String city;

    public Student(String pnr, String name, int age, String course, LocalDate enrolldate, double gpa, String city) {
        this.pnr = pnr;
        this.name = name;
        this.age = age;
        this.course = Course.valueOf(course);
        this.enrolldate = enrolldate;
        this.gpa = gpa;
        this.city = city;
    }

    public String getPnr() {
        return pnr;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getEnrolldate() {
        return enrolldate;
    }

    public double getGpa() {
        return gpa;
    }

    public String getCity() {
        return city;
    }
}
