public class H8 {
    public static void method6(int a) {
        if (a>0) {
            if (a % 400 == 0) {
                System.out.println("Месяц является високосным!");
            } else if (a % 100 == 0) {
                System.out.println("Месяц не является високосным!");
            } else if (a % 4 == 0) {
                System.out.println("Месяц является високосным!");
            } else {
                System.out.println("Месяц не является високосным!");
            }
        }else System.out.println("Такой год не существует!");
    }

    public static void main(String[] args) {
        method6(204);
    }
}
