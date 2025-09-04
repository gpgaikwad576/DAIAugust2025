package StudentProblem;
import java.time.LocalDate;
import java.util.*;
public class Tester {
    public static void main(String[] args){
        Student s1 = new Student("S101", "Anurag", 20, "DAI", LocalDate.of(2023, 8, 15), 3.8, "New York");
        Student s2 = new Student("S102", "Bob", 21, "DITISS", LocalDate.of(2022, 9, 1), 3.5, "Los Angeles");
        Student s3 = new Student("S103", "Charlie", 19, "DBDA", LocalDate.of(2024, 1, 10), 4.0, "Chicago");
        Student s4 = new Student("S104", "Diana", 22, "DAC", LocalDate.of(2021, 5, 20), 3.9, "Houston");
        Student s5 = new Student("S105", "Eve", 20, "DAI", LocalDate.of(2023, 7, 25), 3.2, "Phoenix");
        Student s6 = new Student("S106", "Frank", 23, "DAI", LocalDate.of(2020, 11, 1), 3.6, "Philadelphia");
        Student s7 = new Student("S107", "Grace", 21, "DVLSI", LocalDate.of(2022, 3, 5), 3.7, "San Antonio");

        List<Student> studentList = List.of(s1, s2, s3, s4, s5, s6, s7);

        Utility o1=new Utility();

        System.out.println("");
        System.out.println("List of Students with specific Course: ");
        List<String> filterBycourse=o1.getStudentNameByCourse(studentList,"DAI");
        filterBycourse.stream().forEach(System.out::println);

        System.out.println("");
        System.out.println("List of Students with High Gpa: ");
        System.out.println(o1.getStudentWithHighGpa(studentList,3));

        System.out.println("");
        System.out.println("List of All Cities: ");
        System.out.println(o1.getAllCities(studentList));

        System.out.println("");
        System.out.println("Student Count By Course: ");
        System.out.println(o1.getStudentCountByCourse(studentList));

        System.out.println("");
        System.out.println("Average Gpa: ");
        System.out.println(o1.getAvgGpa(studentList));
    }
}
