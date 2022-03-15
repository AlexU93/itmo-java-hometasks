package hw3;

import java.util.Scanner;
import java.lang.Math;

public class TaskThree {
    public static void main(String[] args) {
        int min = 1;
        int max = 9;
        int a = (int) Math.random() * ((max-min+1)+min);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = in.nextInt();
        while (number != 0) {
            if (number<a) {
                System.out.println("Загаданное число меньше" +a);
            } else if (number>a) {
                System.out.println("Загаданное число больше" +a);
            } else if (number == a) {
                System.out.println("Вы угадали число");
            }
        }

        }
    }
