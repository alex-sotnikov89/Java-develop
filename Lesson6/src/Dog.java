import java.util.Random;
import java.util.Scanner;

public class Dog extends Animal {
    public Dog(String name) {
        this.name=name;
    }

    @Override
    public String toString() {
        return "Собака: " + name;
    }

    @Override
    public void run(Scanner scanner, Random random) {
        int rnd = 400 + random.nextInt(3)*100;
        while (true) {
            System.out.printf("Сколько должна пробежать %s?%n", name);
            int length = scanner.nextInt();
            if (length > 0 && length <= rnd) {
                System.out.printf("Собака по кличке %s пробежала %sм !%n", name, length);
                break;
            } else {
                System.out.printf("Собака по кличке %s не может пробежать такое расстояние!" +
                        "Может только до %sм%n", name, rnd);
            }
        }
    }

    @Override
    public void swim(Scanner scanner, Random random) {
        int rnd = 5 + random.nextInt(11);
        while (true) {
            System.out.printf("Сколько должна проплыть %s?%n", name);
            int length = scanner.nextInt();
            if (length > 0 && length <= rnd) {
                System.out.printf("Собака по кличке %s проплыла %sм !%n", name, length);
                break;
            } else {
                System.out.printf("Собака по кличке %s не может проплыть такое расстояние!" +
                        "Может только до %sм%n", name, rnd);
            }
        }
    }

    @Override
    public void jump(Scanner scanner, Random random) {
        double rnd = 0.5 + random.nextInt(2);
        while (true) {
            System.out.printf("На сколько должна прыгнуть %s?%n", name);
            double height = scanner.nextDouble();
            if (height > 0 && height <= rnd) {
                System.out.printf("Собака по кличке %s прыгнула на %sм !%n", name, height);
                break;
            } else {
                System.out.printf("Собака по кличке %s не может прыгнуть на такую высоту!" +
                        "Может только до %sм%n", name, rnd);
            }
        }
    }


}
