package hw7.school;

import hw7.headmaster.HeadMaster;
import hw7.student.Student;
import hw7.teacher.Teacher;
import hw7.base.skillSubject.SkillSubject;

public class School {


    private String schoolName;
    private HeadMaster headMaster;
    private Teacher[] teachers = new Teacher[4];
    private Student[] students = new Student[4];

    public School(HeadMaster headMaster, String schoolName) {
        this.headMaster = headMaster;
        this.schoolName = schoolName;
    }

    public static Teacher getTeacher(Teacher teacher) {
        if (teacher.getSubject().equalsIgnoreCase("математика")) {

        }
    }

    public static Teacher[] getTeachers(int count) {
        Teacher[] teachers = new Teacher[count];
        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = getTeacher();
        }
        return teachers;
    }
}
