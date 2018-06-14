package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {

    String name;
    List<Student> intstudList = null;
    public Internship(String name) {
        this.name = name;
        this.intstudList = new ArrayList<>();
    }

    public void setStudent(Student student) {
        intstudList.add(student);
    }

    public String getStudents() {
        String res = "";
        for (Student stud : intstudList) {
            res = res + stud.name + "\n";
        }
        return res;
    }
}
