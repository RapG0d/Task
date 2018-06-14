package person;

import person.consciousness.Knowledge;

public class Student {

    public String name;
    public Knowledge knowledge;

    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }
}
