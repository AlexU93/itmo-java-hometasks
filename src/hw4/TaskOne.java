package hw4;
import java.util.Arrays;
public class TaskOne {
    public static void main(String[] args) {
        int max, min;
        double midle = 0;
        int [] arr1 = {28,-13,-9,55,4,-7,1,0,96,101};
        max=min=arr1[0];
        for (int i = 0; i<arr1.length; i++ ) {
            if (arr1[i]<min) {
                min = arr1[i];
            }
            if (arr1[i]>max) {
                max = arr1[i];
            }
            midle = (midle + arr1[i]);
        }
        midle = midle / arr1.length;
        System.out.println("Минимальное значение" + "=" + min);
        System.out.println("Максимальное значение" + "=" + max);
        System.out.println("Среднее значение" + "=" +midle);
    }
}
