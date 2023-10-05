import java.util.ArrayList;
import java.util.List;

public class StudentManager implements Searcheable{
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

    @Override
    public Student search(String name) {
        for (int i=0; i<students.size(); i++){
            Student student = students.get(i);
            if (student.getName().toLowerCase().equals(name.toLowerCase()) ){
                return student;
            }
        }


        return null;
    }
}
