package hw2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaskTwo {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String operand1 = reader.readLine();
        String operand2 = reader.readLine();
        String operator = reader.readLine();
        double number1 = Integer.parseInt(operand1);
        double number2 = Integer.parseInt(operand2);
        int number3 = Integer.parseInt(operator);
        double total = 0;
        switch (number3) {
            case 3:
                total = number1 + number2;
                System.out.println(total);
                break;
        }
        switch (number3) {
            case 5:
                total = number2 - number1;
                System.out.println(total);
                break;
        }
        switch (number3) {
            case 7:
                total = number2 * number1;
                System.out.println(total);
                break;
        }
        switch (number3) {
            case 9:
                total = number2 / number1;
                System.out.println(total);
                break;
        }
    }

}
