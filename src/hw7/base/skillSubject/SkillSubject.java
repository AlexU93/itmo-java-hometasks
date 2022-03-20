package hw7.base.skillSubject;

import hw7.base.human.Human;

abstract public class SkillSubject extends Human {

    protected String subject;

    public SkillSubject(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;

    }

    public String getSubject() {
        return subject;
    }

}
