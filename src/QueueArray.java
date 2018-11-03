public class QueueArray {
    private int[] array = new int[10];
    private int size = 0;

    public void push(int a) {
        array[size++] = a;
    }

    public int pop() {
        return array[size--];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(String.format("%d,", array[i]));
        }
        return result.toString();
    }
}
