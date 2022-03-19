package hw6.task1;

import hw6.task1.climber.Climber;
import hw6.task1.group.Group;
import hw6.task1.mount.Mount;


import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        Group [] arrGroup1 = new Group[3]; // Массив из групп
        Climber [] group1 = new Climber[3]; // Массив из трех человек первой группы
        Climber climber1 = new Climber("Anton", "SpB");
        Climber climber2 = new Climber("Jon", "MsK");
        Climber climber3 = new Climber("Petr", "SpB");
        Mount mount1 = new Mount("Эльбрус", "Россия", 5000);
        Mount mount2 = new Mount("Эверест", "Китай", 9000);
        Mount mount3 = new Mount("Шихан", "Россия", 1000);
        arrGroup1 [0].addArrClimber(climber1);
        arrGroup1 [1].addArrClimber(climber2);
        arrGroup1 [2].addArrClimber(climber3);
        System.out.println(Arrays.toString(arrGroup1));
    }
}
