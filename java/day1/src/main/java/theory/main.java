package theory;
import java.util.Scanner;
public class main {
    public static void main(String args[]){

        Student student1 = new Student("Pankaj");  //object instantiation
        Student student2 = new Student("Anurag");

        student1.setRollNo(20);                          //setter
        System.out.println("Output of getter: "+student1.getRollNo());  //getter
        System.out.println("Output of toString: "+student1); //toString

        Course course1 = new Course("DAI",3);   //course creation
        Course course2 = new Course("DBDA",3);   //course creation

        course1.addStudents(student1);                     //adding students into array, which belongs to class
        course1.addStudents(student2);

        Scanner scanner = new Scanner(System.in);        //taking input
        System.out.print("Enter student name: ");
        String input = scanner.nextLine();
        Student student3 = new Student(input);
        course2.addStudents(student3);
        scanner.close();

        int countStudents = course1.countOfStudents();      //count of students
        System.out.println("count of Students:"+ countStudents);

        Student[] course1Students=course1.getStudents();                //list of students of course1
        System.out.println("list of students in course1:");
        for (int i=0;i<countStudents;i++){
            System.out.println(course1.strength[i]);
        }


    }
}
