package hw4;

import java.util.Arrays;

public class TaskTwo {
    public static void main(String[] args) {
        int j,k;
        int [] arr2 = {2,4,6,8,10,12,14,16,18,20};
        for (int i = 1; i<arr2.length; i++) {
            for (j = arr2.length - 1; j>=i; j-- ) {
                if (arr2[j-1] < arr2 [j]) {
                   k = arr2[j-1];
                   arr2[j-1] = arr2 [j];
                   arr2[j] = k;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
