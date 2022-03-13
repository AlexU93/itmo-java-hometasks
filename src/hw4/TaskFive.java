package hw4;

import java.util.Arrays;

public class TaskFive {
    public static void main(String[] args) {
        int size = 0;
        int arr6[] = {2, -4, 7, -88, -2, 0, -5, -32, 4, -7};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < 0) {
                size++;
            }
        }
        int newarr6[] = new int[size];
        int nsize = 0;
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < 0) {
                newarr6[nsize++] = arr6[i];
            }
        }
        System.out.println(size);
        System.out.println(Arrays.toString(newarr6));
    }
}

