import sda.java12poz.structures.BinaryTreeElement;

import java.util.Stack;

public class Main {

    public static String convertBase(int number, int base) {
        String result = "";
        Stack<Integer> stack = new Stack<>();
        do {
            stack.push(number % base);
            number = number / base;
        } while (number > 0);
        while (!stack.empty()) {
            Integer digit = stack.pop();
            if (digit >= 10) {
                result = result + (char) ('a' + (digit - 10));
            } else {
                result = result + digit;
            }
        }
        return result;
    }

    public static void convertBaseExample() {
        System.out.println(convertBase(13, 2));
        System.out.println(convertBase(12, 8));

        System.out.println(convertBase(0b1011, 2));
        System.out.println(convertBase(066, 8));
        System.out.println(convertBase(126, 16));

    }

    public static int binarySearch(int[] array, int value) {

        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {
            System.out.print(".");
            middle = (left + right) / 2;
            if (array[middle] < value) left = middle + 1;
            else if (array[middle] > value) right = middle -1;
            else return middle;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] example = {1,4,7,12,13,14,15,21,23,44,55,66,77,88,99,100};

        System.out.println("");
        System.out.println(binarySearch(example, 1));
        System.out.println(binarySearch(example, 77));
        System.out.println(binarySearch(example, 13));
        System.out.println(binarySearch(example, 100));
        System.out.println(binarySearch(example, 0));

    }
}
