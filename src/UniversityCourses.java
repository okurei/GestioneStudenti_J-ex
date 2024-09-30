import java.util.HashMap;
import java.util.HashSet;

public class UniversityCourses{
    String course1 = "Math101";
    String course2 = "Literature101";
    String course3 = "CS101";
    String course4 = "History101";
    String course5 = "Geography101";

    HashMap<String, HashSet<String>> courses = new HashMap<>();

    public void addStudent(Student student){
        courses.put(student.registrationNumber,student.getCourses() );
    }


}
