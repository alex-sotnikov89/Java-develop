import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] array = getArray(scanner);
        drawArray(array);
        playTicTacToe(scanner, random, array);

    }

    // Методы:

    //1. Построение поля.
    static char[][] getArray() {
        return new char[][]{
                {'_', '_', '_'},
                {'_', '_', '_'},
                {'_', '_', '_'}
        };
    }
    //-------------------------

    //2.Печать поля.
    static void drawArray(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print("|" + array[i][j] + "|");
            }
            System.out.println();
        }
    }
    //--------------------------

    //3. Получение координат.
    static int getCoordinate(Scanner scanner, char[][] array,char coordName) {
        int coord;
        do {
            System.out.println(String.format("Введите координату по оси %s в диапозоне от 1 до %s!", coordName, array.length));
            coord = scanner.nextInt() - 1;
            if (coord < 0 || coord > array.length-1) {
                System.out.println("Вы ввели число вне диапозона игрового поля! Попробуйте ещё раз!");
            }
        } while (coord < 0 || coord > array.length-1);
        return coord;
    }
    //--------------------------

    //4. Ход игрока.
    static void doPlayerMove(Scanner scanner, char[][] array) {
        int x;
        int y;
        do {
            x = getCoordinate(scanner, array,'X');
            y = getCoordinate(scanner, array,'Y');
            if (array[x][y] != '_') {
                System.out.println("Позиция уже занята!");
            }
        }
        while (array[x][y] != '_');
        array[x][y] = 'x';
    }
    //--------------------------

    //5. Ход компьютера.
    static void doComMove(Random random, char[][] array) {
        int x;
        int y;
        do {
            x = random.nextInt(array.length);
            y = random.nextInt(array.length);
        }
        while (array[x][y] != '_');
        array[x][y] = 'o';
    }

    //---------------------------

    //6. Ничья.
    static boolean isDraw(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == '_') {
                    return false;
                }
            }
        }
        return true;
    }
    //---------------------------

    //7. Игра.
    static void playTicTacToe(Scanner scanner, Random random, char[][] array) {
        do {
            doPlayerMove(scanner, array);
            drawArray(array);
            if (isFinal(array, 'x')) {
                break;
            }
            System.out.println("--------------");
            doComMove(random, array);
            drawArray(array);
            if (isFinal(array, 'o')) {
                break;
            }
        } while (true);

    }
    //---------------------------

    //8. Комбинации окончания игры.
    static boolean isWin(char[][] array, char symbol) {
        /**
         * Проверка на горизонталь
         */
//        for (int i = 0; i < array.length; i++) {
//            if (array[i][0] == symbol && array[i][1] == symbol && array[i][2] == symbol) {
//                return true;
//            }
//        }
        if (isWinGorizontal(array,symbol)) {
                return true;
            }

        /**
         * Проверка на вертикаль
         */
//        for (int i = 0; i < array.length; i++) {
//            if (array[0][i] == symbol && array[1][i] == symbol && array[2][i] == symbol) {
//                return true;
//            }
//        }
        if (isWinVertical(array,symbol)) {
            return true;
        }

        /**
         * Проверка на диагональ
         */
//        if (array[0][0] == symbol && array[1][1] == symbol && array[2][2] == symbol) {
//            return true;
//        }
//        if (array[0][2] == symbol && array[1][1] == symbol && array[2][0] == symbol) {
//            return true;
//        }
        if (isWinMainDiagonal(array,symbol)) {
            return true;
        }
        if (isWinDiagonal(array,symbol)) {
            return true;
        }

        return false;
    }
    //------------------------

    //9.Проверка на окончание игры после каждого хода.
    static boolean isFinal(char[][] array, char symbol) {
        if (isWin(array, symbol)) {
            String name = symbol == 'x' ? "Player" : "AI";
            System.out.println(String.format("%s won", name));
            return true;
        }
        if (isDraw(array)) {
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }
    //------------------------

    /**
     * Заданиче №3
     */

    //1. Построение поля
    static char[][] getArray(Scanner scanner) {
        System.out.println("Введите размер поля.");
        int a = scanner.nextInt();
        char[][] array = new char[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = '_';
            }
        }
        return array;
    }
    //-------------------

    //2. Проверка на горизонталь
    static boolean isWinGorizontal(char[][] array, char symbol) {
        int a;
        OUTER:
        for (int i = 0; i < array.length; i++) {
            a = 0;
            INNER2:
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[i][j] == symbol && array[i][j] == array[i][j + 1]) {
                    a++;
                } else {
                    break;
                }
            }
            if (a == array[i].length - 1) {
                return true;
            }
        }
        return false;
    }
    //---------------------

    //3. Проверка на вертикаль.
    static boolean isWinVertical(char[][] array, char symbol) {
        int a;
        OUTER:
        for (int i = 0; i < array.length; i++) {
            a = 0;
            INNER2:
            for (int j = 0; j < array[i].length - 1; j++) {
                if (array[j][i] == symbol && array[j][i] == array[j + 1][i]) {
                    a++;
                } else {
                    break INNER2;
                }
            }
            if (a == array[i].length - 1) {
                return true;
            }
        }
        return false;
    }
    //---------------------

    //4. Проверка на главную диагональ.
    static boolean isWinMainDiagonal(char[][] array, char symbol) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] == symbol && array[i][i] == array[i + 1][i + 1]) {
                a++;
            } else {
                break;
            }
            if (a == array[i].length - 1) {
                return true;
            }
        }
        return false;
    }

    //---------------------
    //5. Проверка на обратную диагональ.
    static boolean isWinDiagonal(char[][] array, char symbol) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = array[i].length - 1-i; j > 0; j--) {
                if (array[i][j] == symbol && array[i][j] == array[i + 1][j - 1]) {
                    a++;
                    if (a == array[i].length - 1) {
                        return true;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }
    //---------------------
}




