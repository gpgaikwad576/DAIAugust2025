package theory;

public class Course {
    Student[] strength;
    int i=0;
    String name;
    public Course(String name, int size){
        this.name = name;
        this.strength =new Student[size];
    }
    public void addStudents(Student sd){
        strength[i++]=sd;
    }
    public Student[] getStudents(){
        return this.strength;
    }
    public int countOfStudents(){
        return i;
    }
}
