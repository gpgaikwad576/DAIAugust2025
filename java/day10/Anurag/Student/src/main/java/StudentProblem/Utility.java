package StudentProblem;

import java.util.*;
import java.util.stream.Collectors;

public class Utility {
    List<String> getStudentNameByCourse(List<Student>students,String course){
        return students.stream().filter(p->p.getCourse().equals(course)).map(p->p.getName()).collect(Collectors.toList());
    }

    List<Student> getStudentWithHighGpa(List<Student>students,double gpa){
        return students.stream().filter(p->p.getGpa()>gpa).collect(Collectors.toList());
    }

    Set<String> getAllCities(List<Student> students){
        return students.stream().map(p->p.getCity()).collect(Collectors.toSet());
    }

    Map<Course,Long> getStudentCountByCourse(List<Student>students){
        return students.stream().collect(Collectors.groupingBy(Student::getCourse,Collectors.counting()));
    }

    double getAvgGpa(List<Student>students){
//        return students.stream().map(p->p.getGpa()).reduce(0.0,Double::sum)/students.size();
        return students.stream().collect(Collectors.averagingDouble(p->p.getGpa()));
    }












}
