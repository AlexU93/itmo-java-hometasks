package hw7.base.human;

abstract public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }
}
