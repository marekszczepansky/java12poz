import java.util.Comparator;

public interface Sorting<T extends Comparable> {
    T[] sort(T[] array);
    T[] sort(T[] array, Comparator<T> comparator);
}
