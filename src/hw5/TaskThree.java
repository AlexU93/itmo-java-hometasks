package hw5;

import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        String sentence = "в предложении все слова разной длины";
        String [] words = sentence.split(" ");
        String maxword = words [0];
        for (int i=1; i<words.length; i++) {
            if (words[i].length() > maxword.length()) {
                maxword = words[i];
            }
        }
        System.out.println(maxword);
        System.out.println(maxword.length());
    }
}
