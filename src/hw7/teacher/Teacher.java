package hw7.teacher;

import hw7.base.skillSubject.SkillSubject;
import hw7.student.Student;


public class Teacher extends SkillSubject {
    protected int teacherSkill = 100;


    public Teacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public void teacherNameSubject() {
        System.out.println("Teacher name" + "-" + name + " " + "teach" + "-" + subject);
    }



    public void teach(Student student) {
        student.beTeacher(teacherSkill);
    }


}






