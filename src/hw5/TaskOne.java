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

        for (int i = 0; i<arrs1.length; i++) {
            System.out.println("Введите слово");
            String word = sr.nextLine();
            arrs1 [i] = word;
            if ("exit".equals(word)) break;
        }
        for (int i = 0; i<arrs1.length-1; i++) {
            if (arrs1[i].equals(arrs1[i+1])) {
                arrs1 [i+1] = "Повтор";
            }
        }

        System.out.println(Arrays.toString(arrs1));
    }
}
