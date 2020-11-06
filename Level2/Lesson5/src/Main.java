public class Main{
    static final int size = 10000000;
    static final int h = size / 2;

    public static float[] createArray() {
        float[] array = new float[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        return array;
    }

    public static void changeValueOfArray(float[] array) {
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Passing time without multithreading: " + (System.currentTimeMillis() - a) + " ms.");
    }

    public static void changeValueOfArrayMultithreading(float[] array){
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        Thread t1 = new Thread(() -> {
            long changeArray;
            changeArray = System.currentTimeMillis();
            System.arraycopy(array, 0, a1, 0, h);
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
//            System.arraycopy(a1, 0, array, 0, h);
            spliceArray(array,a1,0);
            System.out.println("Time when array # 1 was changed: " + (System.currentTimeMillis() - changeArray) + " ms.");
        });

        Thread t2 = new Thread(() -> {
            long changeArray;
            changeArray = System.currentTimeMillis();
            System.arraycopy(array, h, a2, 0, h);
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
//            System.arraycopy(a2, 0, array, h, h);
            spliceArray(array,a2,h);
            System.out.println("Time when array # 2 was changed: " + (System.currentTimeMillis() - changeArray) + " ms.");
        });

        t1.start();
        t2.start();
    }

    public static synchronized void spliceArray(float[] array,float[] a, int n){
        System.arraycopy(a, 0, array, n, h);
    }

    public static void main(String[] args){
        float[] array = createArray();
        changeValueOfArray(array);

        float[] array2 = createArray();
        changeValueOfArrayMultithreading(array2);


//        Проверка!!!!!!!
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i <50 ; i++) {
//            System.out.println(array2[i]+" : "+ (array2[i+5000000]));
//        }
    }

}
