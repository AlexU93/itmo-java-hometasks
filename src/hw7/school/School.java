package hw7.school;

import hw7.headmaster.HeadMaster;
import hw7.student.Student;
import hw7.teacher.Teacher;


public class School {
    private String schoolName = "First School";
    //protected String[] arrStudents = new String[4];
    protected String[] arrTeachers = new String[4];




    public static void main(String[] args) {
        HeadMaster headmaster = new HeadMaster("Vladimir", 50);
        headmaster.headMasterName();

        Student student1 = new Student("Oleg", 12, "Math");
        //student1.nameSubjectStudent();
        student1.addArrStudent(student1);
        Student student2 = new Student("Andrey", 12, "Math");
        //student2.nameSubjectStudent();
        student2.addArrStudent(student1);
        Student student3 = new Student("Maria", 13, "Literature");
        //student3.nameSubjectStudent();
        student3.addArrStudent(student1);
        Student student4 = new Student("Olga", 13, "Literature");
        //student4.nameSubjectStudent();
        student4.addArrStudent(student1);

        Teacher teacher1 = new Teacher("Victoria", 35, "Math");
        teacher1.teacherNameSubject();
        Teacher teacher2 = new Teacher("Pavel", 40, "Literature");
        teacher2.teacherNameSubject();

    }

}
