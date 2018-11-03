import sda.java12poz.entities.Person;
import sda.java12poz.sort.Bubble;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    private static Integer[] test = {1, 11, 2, 22, 99, 9, 88, 8};
    private static int[] test1 = {1, 11, 2, 22, 99, 9, 88, 8};
    private static String[] test2 = {"Ala", "ma", "kota"};

    public static final Comparator<String> STRING_LENGTH_COMPARATOR = (o1, o2) -> o1.length() - o2.length();

    public static void main(String[] args) {


        Person[] persons = Person.exampleArray(3);

        bubbleSort(persons, ((o1, o2) -> o1.getName().compareTo(o2.getName())));
        System.out.println(Arrays.toString(persons));

        bubbleSort(persons, ((o1, o2) -> o1.getLastName().compareTo(o2.getLastName())));
        System.out.println(Arrays.toString(persons));

        bubbleSort(persons, ((o1, o2) -> o1.getBirthDate().compareTo(o2.getBirthDate())));
        System.out.println(Arrays.toString(persons));
    }

    public static <T extends Comparable<T>> T[] quickSort(T[] array) {
        return quickSort(array, 0, array.length - 1);
    }

    private static <T extends Comparable<T>> T[] quickSort(T[] array, int left, int right) {
        int i, j;
        T pivot, temp;

        i = (left + right) / 2;
        pivot = array[i];
        array[i] = array[right];
        for (j = i = left; i < right; i++) {
            if (array[i].compareTo(pivot) < 0) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
        array[right] = array[j];
        array[j] = pivot;
        if (left < j - 1) quickSort(array, left, j - 1);
        if (j + 1 < right) quickSort(array, j + 1, right);
        return array;
    }

    public static <T extends Comparable<T>> T[] insertionSort(T[] input) {

        T x;
        int i, j = input.length - 2;

        while (j >= 0) {
            x = input[j];
            i = j + 1;
            while ((i < input.length)  && (x.compareTo(input[i]) > 0)) {
                input[i - 1] = input[i];
                i++;
            }
            input[i - 1] = x;
            j--;
        }
        return input;
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] x) {
        int n = x.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (x[j].compareTo(x[j + 1]) > 0) {
                    T temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }


    public static <T extends Comparable<T>> void bubbleSort(T[] x, Comparator<T> comparator) {
        int n = x.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comparator.compare(x[j], x[j + 1]) > 0) {
                    T temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }

    public static <T> T[] moveLast2Head(T[] in) {
        T temp = in[in.length - 1];
        for (int i = 1; i < in.length; i++) {
            in[in.length - i] = in[in.length - i - 1];
        }
        in[0] = temp;
        return in;
    }

    public static String printDateTime(String givenDate) {
        DateTimeFormatter givenFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate givenDateObject = LocalDate.parse(givenDate, givenFormatter);


        return givenDateObject.format(formatter);
    }

    public static int pick(int[] array, int index) {
        return array[index];
    }

    public static <T> T pickGeneric(T[] array, int index) {
        return array[index];
    }

    public static <T> int findGeneric(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> Optional<T> findElement(T[] array, T element) {
        for (T anArray : array) {
            if (anArray.equals(element)) {
                return Optional.of(anArray);
            }
        }
        return Optional.empty();
    }


    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int gcd2(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }


/***
 *
 * prime (n)
 *
 *  jeżeli n < 2
 *      return false
 *
 *  i = 2
 *  dopóki i < n
 *      jeżeli n % i == 0
 *          return false
 *      i ++
 *
 *  return true
 *
 *
 */


}
