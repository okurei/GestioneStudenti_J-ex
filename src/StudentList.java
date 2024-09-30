import java.util.ArrayList;

public class StudentList {
    public StudentList() {
    }
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(int index){
        students.remove(index);
    }
    public void printStudent(int index){
        Student student = students.get(index);
        System.out.println(student.toString());
    }
    public void printAllStudents(){
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
