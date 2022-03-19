package hw6.task1.group;

import hw6.task1.climber.Climber;

public class Group {
    private Climber[] arrClimber = new Climber[3];
    private boolean full;

    public void addArrClimber(Climber climber) {
        for (int i = 0; i < arrClimber.length; i++) {
            if (arrClimber[i] == null) {
                if (i == arrClimber.length) {
                    full = true;
                    System.out.println("Группа заполнена");
                }
                if (full == false) {
                    arrClimber[i] = climber;
                    return;
                }
            }
        }
    }

}
