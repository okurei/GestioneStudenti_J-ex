import java.util.HashSet;
import java.util.Hashtable;
import java.util.Objects;

public class Student {
    String name;
    String surname;
    String registrationNumber;

    HashSet<String> courses = new HashSet<>();

    public Student(String name, String surname, int registrationNumber) {
        this.name = name;
        this.surname = surname;
        this.registrationNumber = String.valueOf(registrationNumber);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public void coursesRegistration (String course){
        courses.add(course);
    }

    public HashSet<String> getCourses() {
        return courses;
    }
}
