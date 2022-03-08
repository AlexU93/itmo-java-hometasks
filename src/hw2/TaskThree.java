package hw2;
import java.lang.Math;
public class TaskThree {
    public static void main(String[] args) {
        double min = 10;
        double max = 500;
        double c = Math.random() * ((max-min+1)+min);
        if ((c>= 25) & (c<= 200)) {
            System.out.println("Число содержится в интервале (25;200)");
        }
        else {
                System.out.println("Число не содержится в интервале (25;200)");
            }
        System.out.println(c);
    }
}
