import java.util.List;
import java.util.ArrayList;
public class Utility {

    List<String> getStudentNamesByCourse(List<Student> students, String course){

        List<String> filteredStudents = new ArrayList<>();
        for(int i =0;i<students.size();i++){
            if(students.get(i).getCourse().equals(course)) filteredStudents.add(students.get(i).getName());
        }
        return filteredStudents;
    }
}
