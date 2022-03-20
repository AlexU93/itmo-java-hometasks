package hw7.teacher;

import hw7.base.skillSubject.SkillSubject;


public class Teacher extends SkillSubject {
    protected int teacherSkill = 100;


    public Teacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    public void teacherNameSubject () {
        System.out.println("Teacher name" + "-" + name + " " + "teach" + "-" + subject);

    }

    //Teacher teacher1 = new Teacher("Victoria", 35, "Math");
    //Teacher teacher2 = new Teacher("Pavel", 40, "Literature");


}






