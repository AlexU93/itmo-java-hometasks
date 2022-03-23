package hw7.student;

import hw7.base.skillSubject.SkillSubject;
import hw7.school.School;

import java.util.Arrays;


public class Student extends SkillSubject {
    private int level;

    public Student(String name, int age, String subject) {
        super(name, age, subject);
    }

    public void nameSubjectStudent() {
        System.out.println("Student name" + "-" + name + " " + "Subject" + "-" + subject);
    }

    public int getLevel() {
        return level;
    }

    public void beTeacher(int skillTeacher) {
        level = level + ((int) Math.random() * skillTeacher);
    }
}




