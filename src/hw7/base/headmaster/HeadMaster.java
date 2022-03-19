package hw7.base.headmaster;

import hw7.base.human.Human;

public class HeadMaster extends Human {

    public HeadMaster(String name, int age) {
        super(name, age);
    }
        public void startLesson () {
            System.out.println("Начало занятий");
        }

        public void endLesson () {
            System.out.println("Окончание занятий");
        }


}
