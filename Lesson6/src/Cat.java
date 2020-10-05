import java.util.Random;
import java.util.Scanner;

public class Cat extends Animal {
    public Cat(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Кот: " + name;
    }

    @Override
    public void run(Scanner scanner, Random random) {
        int rnd = 100 + random.nextInt(3)*100;
        while (true) {
            System.out.printf("Сколько должен пробежать %s?%n", name);
            int length = scanner.nextInt();
            if (length > 0 && length <= rnd) {
                System.out.printf("Кот по кличке %s пробежал %sм !%n", name, length);
                break;
            } else {
                System.out.printf("Кот по кличке %s не может пробежать такое расстояние!" +
                        "Может только до %sм%n", name, rnd);
            }
        }
    }

    @Override
    public void swim(Scanner scanner, Random random) {
        System.out.println("Коты не умеют плавать =(");
    }

    @Override
    public void jump(Scanner scanner, Random random) {
        double rnd = 1.5 + random.nextInt(2);
        while (true) {
            System.out.printf("На сколько должен прыгнуть %s?%n", name);
            double height = scanner.nextDouble();
            if (height > 0 && height <= rnd) {
                System.out.printf("Кот по кличке %s прыгнул на %sм !%n", name, height);
                break;
            } else {
                System.out.printf("Кот по кличке %s не может прыгнуть на такую высоту!" +
                        "Может только до %sм%n", name, rnd);
            }
        }
    }

}
