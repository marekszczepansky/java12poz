import java.util.Random;

public class DataStructures {

    public static int[] random(int a) {
        int[] array = new int[a];
        Random generator = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt();
        }
        return array;
    }

    public static int[] even(int a) {
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2;
        }
        return array;
    }

    public static int[] odd(int a) {
        int[] array = new int[a];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }
        return array;
    }

}
