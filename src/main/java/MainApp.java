import java.awt.*;

public class MainApp {
    public static void main(String[] args){
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Gugu", 10, 8));
        studentManager.addStudent(new Student("Gugi", 11, 8));
        studentManager.displayStudents();
        Student student= studentManager.search("gugu");
        System.out.println("My student is "+ student.getName());
    }
}
