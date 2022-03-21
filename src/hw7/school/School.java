package hw7.school;

import hw7.headmaster.HeadMaster;
import hw7.student.Student;
import hw7.teacher.Teacher;

public class School {


    private String schoolName;
    private HeadMaster headMaster;
    private Teacher [] teachers = new Teacher[4];
    private Student [] students = new Student[4];

    public School(HeadMaster headMaster, String schoolName) {
        this.headMaster = headMaster;
    }

    private void setSchoolName (String schoolName) {
        if (schoolName == null)
    }


}
