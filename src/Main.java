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

    private void convertBaseExample() {
        System.out.println(convertBase(13, 2));
        System.out.println(convertBase(12, 8));

        System.out.println(convertBase(0b1011, 2));
        System.out.println(convertBase(066, 8));
        System.out.println(convertBase(126, 16));

    }

    public static void main(String[] args) {
        BinaryTreeElement root = BinaryTreeElement.exampleTree();
        System.out.println(root.getPreOrderedList());
        System.out.println(root.toFormattedJSON());
    }
}
