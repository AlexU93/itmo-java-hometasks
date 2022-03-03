package hw1;

public class TaskOne {
    public static void main(String[] args) {
        int sum = 150_000; // изначальная цена
        int price = 100_000; // цена больше которой действует скидка
        double discount = 1.1; // 10% скидка
        double fprice = sum > price ? sum / discount: sum;
        System.out.println(fprice);
    }
}
