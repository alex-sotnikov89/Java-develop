import java.util.Random;
import java.util.Scanner;

public class Main {
    static int getRandomNumber() {
        Random random = new Random();
        int hidden_number = random.nextInt(10);
        return hidden_number;
    }

    static void playGameGuessTheNumber(int attempt) {
        int hidden_number = getRandomNumber();
        int input_number;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Чтобы угадать число у Вас есть %s попытки(а)!%n", attempt);
            System.out.println("Угадайте число от 0 до 9");
            for (int i = 0; i < attempt; i++) {
                input_number = scanner.nextInt();
                if (input_number == hidden_number) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (input_number > hidden_number) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
                System.out.printf("Осталось %s попытки(а)!%n", attempt - i - 1);
                if (attempt - i - 1 == 0) {
                    System.out.println("Вы проиграли!");
                }
            }
            while (true) {
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                input_number = scanner.nextInt();
                if (input_number == 1) {
                    break;
                } else if (input_number == 0) {
                    break;
                } else {
                    System.out.println("Вы неверно ввели число!!!");
                }
            }
        } while (input_number != 0);
        scanner.close();
    }

    public static void main(String[] args) {
        int attempt = 3;
        playGameGuessTheNumber(attempt);
    }
}
