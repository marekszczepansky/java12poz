import java.util.Optional;

public class Main {

    private static Integer[] test = {6, 66, 3, 1, 2, 4};
    private static String[] test2 = {"Ala", "Ola", "Ela"};

    public static void main(String[] args) {
        Integer element = 3;

        Optional<Integer> el1 = findElement(test, element);
        element++;
        Optional<Integer> el2 = findElement(test, element);

        el1.ifPresent( elem -> System.out.println(elem));
        el2.ifPresent( elem -> System.out.println(elem));
    }


    public static int pick(int[] array, int index) {
        return array[index];
    }

    public static <T> T pickGeneric(T[] array, int index) {
        return array[index];
    }

    public static <T> int findGeneric(T[] array ,T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> Optional<T> findElement(T[] array , T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return Optional.of(array[i]);
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


/**
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
