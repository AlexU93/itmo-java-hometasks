package hw4;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        int[] arr3 = new int[11];
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < 11; i++) {
            arr3[i] = -1 + (int) (Math.random() * 3);
            if (arr3[i] == -1) {
                count1++;
            }
            if (arr3[i] == 0) {
                count2++;
            }
            if (arr3[i] == 1) {
                count3++;
            }
        }
        System.out.println(Arrays.toString(arr3));
        System.out.println("Число -1 встречается" + " " + count1 + " " + "раз");
        System.out.println("Число 0 встречается" + " " + count2 + " " + "раз");
        System.out.println("Число 1 встречается" + " " + count3 + " " + "раз");
    }
}
