package hw4;

import java.util.Arrays;

public class TaskFour {
    public static void main(String[] args) {
        int arr4 [] = {2,-33,6,-8,12,6,-41,88,3,3};
        Arrays.sort (arr4);
        int newarr1 [] = Arrays.copyOfRange(arr4, 0, 5);
        int newarr2 [] = Arrays.copyOfRange(arr4, 5, 10);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(newarr1));
        System.out.println(Arrays.toString(newarr2));
    }
}
