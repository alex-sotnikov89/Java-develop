public class H4 {
    public static boolean metod2(int a, int b) {
        int summa = a + b;
        return (summa>=10 && summa<=20) ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(metod2(5, 15));
    }
}
