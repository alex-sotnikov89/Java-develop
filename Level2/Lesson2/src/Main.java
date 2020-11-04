public class Main {


    public static boolean checkArrayLength(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Array length  is not correct: " + array.length + ". It must be 4!");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException("Array length  is not correct: " + array[i].length + ". It must be 4!");
            }
        }
        return true;
    }

    public static void sumArray(String[][] array) {
        int sum = 0;
        try {
            checkArrayLength(array);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.valueOf(array[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException("Элемент [" + i + "][" + j + "] не числовой!", nfe);
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        sumArray(array);
    }
}
