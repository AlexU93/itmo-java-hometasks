package hw3;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int userNum = in.nextInt();
        int sum = 0;
        while (userNum != 0) {
            if (userNum<=0) {
                System.out.println("Ошибка");
                break;
            }
            sum += userNum%10;
            userNum /= 10;
            System.out.println(sum);
        }
    }
}
