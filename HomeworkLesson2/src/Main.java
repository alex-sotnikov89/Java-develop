import java.util.Random;

public class Main {
    // Задание №1
    static void change_elements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else array[i] = 0;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Задание №2
    static void filling_array(int[] array) {
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a += 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    // Задание №3
    static void transformation_array(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Задание №4
    static void filling_diagonalOfArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                }
            }
        }
//        Вариант 2, но какой лучше? Получается он 4 раза перезаписывает одну и ту же позицию.
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                    array[i][i] = 1;
//            }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Задание №5
    static void showMaxAndMinElementsOfArray(int[] array) {
        int maximum = array[0];
        int minimum = array[0];

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        }
        System.out.println("Максимальное число: " + maximum);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.println("Минимальное число: " + minimum);
    }

    // Задание №6
    static boolean isArraySymmetrySumm(int[] array) {
        int summ1 = 0;
        int summ2;

        for (int i = 0; i < array.length; i++) {
            summ1 += array[i];
            summ2 = 0;
            for (int j = i + 1; j < array.length; j++) {
                summ2 += array[j];
            }
//            System.out.println(summ1);
//            System.out.println(summ2);
            if (summ1 == summ2) {
//                System.out.println(true);
                return true;
            }
        }
        return false;
    }

    // Задание №7
    static void shiftArray(int[] array, int n) {
        int element;

        if (n < 0) {
            while (n < 0) {
                n += array.length;
            }
        }

        while (n >= array.length) {
            n -= array.length;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                element = array[i + 1];
                array[i + 1] = array[0];
                array[0] = element;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Задание №1
        System.out.println("Задание №1: ");
        int[] array1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        change_elements(array1);

        System.out.println();
        System.out.println();

        // Задание №2
        System.out.println("Задание №2: ");
        int[] array2 = new int[8];
        filling_array(array2);

        System.out.println();
        System.out.println();

        // Задание №3
        System.out.println("Задание №3: ");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        transformation_array(array3);

        System.out.println();
        System.out.println();

        // Задание №4
        System.out.println("Задание №4: ");
        int[][] array4 = new int[4][4];
        filling_diagonalOfArray(array4);

        System.out.println();
        System.out.println();

        // Задание №5
        System.out.println("Задание №5: ");
        int[] array5 = {-1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        showMaxAndMinElementsOfArray(array5);

        System.out.println();
        System.out.println();

        // Задание №6
        System.out.println("Задание №6: ");
        int[] array6 = {1, 2, 1, 4};
        System.out.println(isArraySymmetrySumm(array6));

        System.out.println();
        System.out.println();

        // Задание №7
        System.out.println("Задание №7: ");
        int[] array7 = {1, 2, 3, 4, 5};
        int n = -6; //Отрицательное число - сдвиг влево; положительное - вправо.
        shiftArray(array7, n);

        System.out.println();
    }
}
