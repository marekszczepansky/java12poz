package sda.java12poz.structures;

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

        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 2 + 1;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index poza tablicą");
        }

        return array;
    }

    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return i;
        }
        return -1;
    }

    public static int[] sortedInsert(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0, j  = 0;
        while (i < array.length) {
            if (array[i] > element && (i==0 || array[i-1] <= element)) {
                result[j++] = element;
            }
            result[j] = array[i];
            i++;
            j++;
        }
        if (i == j) {
            result[j] = element;
        }
        return result;
    }
}



