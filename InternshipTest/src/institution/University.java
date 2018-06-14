package institution;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class University {


    String name;
    List<Student> studentList = null;
    public University(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();

    }

    public void setStudent(Student student) {
        for(Student stud: studentList)
            if(stud.name.equals(student.name)) {
                stud.setKnowledge(student.knowledge);
            }
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}
