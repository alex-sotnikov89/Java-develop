import java.util.Random;
import java.util.Scanner;
abstract public class Animal {
    protected String name;
    abstract protected void run(Scanner scanner, Random random);

    abstract protected void swim(Scanner scanner, Random random);

    abstract protected void jump(Scanner scanner, Random random);

}
