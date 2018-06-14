package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {
        University university = new University("CH.U.I.");
        Internship internship = new Internship("Interlink");
        //university.addStudent(new Student("Andrew Kostenko"));
        //university.addStudent(new Student("Julia Veselkina"));
        //university.addStudent(new Student("Maria Perechrest"));
        for (String line : Files.readAllLines(Paths.get("D:/Task/InternshipTest/src/Students.txt")))
        {
            String[] text = line.split(" ");
            String name = text[0] + " " + text[1];
            int level = Integer.parseInt(text[2]);

            Student stud = new Student(name);
            Knowledge lev = new Knowledge(level);

            stud.setKnowledge(lev);

            university.addStudent(stud);

            //оценка максимум 5 балов, поэтому средний уровень 3, нада выше среднего
            if (level > 3) internship.setStudent(stud);
        }


        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
