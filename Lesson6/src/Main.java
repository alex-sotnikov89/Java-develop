import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Animal[] animals = {
                new Dog("Жучка"),
                new Dog("Лэйла"),
                new Cat("Дымок"),
                new Cat("Рыжик"),
        };

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
            animals[i].run(scanner, random);
            animals[i].swim(scanner, random);
            animals[i].jump(scanner, random);
            System.out.println("-----------------------");
        }
        scanner.close();
    }
}
