package hw2;

public class TaskOne {
    public static void main(String[] args) {
        int count = 74; // количесвто верных ответов
        if ((count <= 100) & (count >= 90)){
            System.out.println("Отлично");
        }
        if ((count <= 89) & (count >= 60)){
            System.out.println("Хорошо");
        }
        if ((count <= 59) & (count >= 40)){
            System.out.println("Удовлетворительно");
        }
        if ((count <= 39) & (count >= 0)){
            System.out.println("Попробуйте в следующий раз");
        }
    }
}

