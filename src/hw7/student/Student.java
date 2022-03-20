package hw7.student;

import hw7.base.skillSubject.SkillSubject;
import hw7.school.School;

import java.util.Arrays;


public class Student extends SkillSubject {
    protected String[] arrStudents = new String[4];
    public Student(String name, int age, String subject) {
        super(name, age, subject);
    }

    public void nameSubjectStudent() {
        System.out.println("Student name" + "-" + name + " " + "Subject" + "-" + subject);
    }

    public void addArrStudent(Student student) {
        for (int i = 1; i < arrStudents.length; i++) {
            this.arrStudents[i] = student.toString();
        }
        System.out.println(Arrays.toString(arrStudents));
    }


    public void beTeacher(int skill, int skillTeacher) {
        if (skill <= skillTeacher) {
            skill = skill + (0 * (int) Math.random() * skillTeacher);
            return;
        }
    }

}


