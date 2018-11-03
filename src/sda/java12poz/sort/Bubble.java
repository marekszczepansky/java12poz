package sda.java12poz.sort;

import java.util.Comparator;

@SuppressWarnings("ALL")
public class Bubble<T extends Comparable> implements Sorting<T> {
    @Override
    public T[] sort(T[] array) {
        return sort(array, (o1, o2) -> o1.compareTo(o2));
    }

    @Override
    public T[] sort(T[] array, Comparator<T> comparator) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
