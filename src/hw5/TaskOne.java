package hw5;

import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();
        Scanner sr = new Scanner(System.in);
        String[] arrs1 = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите слово");
            String word = sr.nextLine();
            if (sr.equals(arrs1[i]) == true) {
                arrs1[i] = word;
                System.out.println(sr.equals(arrs1[i]));
            }
        }
        System.out.println(Arrays.toString(arrs1));
    }
}
