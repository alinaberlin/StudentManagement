import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> students=new ArrayList<>();
    public  void addStudent(Student student){
        students.add(student);
    }
    public  void removeStudent(Student student){
        students.remove(student);
    }
    public  void displayStudents(){
        for(int i = 0; i<students.size(); i++ ) {
            System.out.println(students.get(i).getName());
        }
    }
}
