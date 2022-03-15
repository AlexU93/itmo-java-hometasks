package hw5;

import java.util.Locale;
import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        String word = "heLLO";
        String allword = "";
        allword = word.substring(0,1).toUpperCase() + word.substring(1,5).toLowerCase();
        System.out.println(allword);
    }
}
