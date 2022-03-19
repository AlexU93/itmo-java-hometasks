package hw7.base.skillSubject;

import hw7.base.human.Human;

abstract public class SkillSubject extends Human {
    private int skill;
    private String subject;

    public SkillSubject (String name, int age, int skill, String subject) {
        super (name, age);
        this.skill = skill;
        this.subject = subject;

    }
}
