package sda.java12poz.structures;

public class MyList<T> {
    public Element<T> head = null;
    public Element<T> tail = null;
    public int count = 0;

    public void printElementsRev() {
        Element<T> p = tail;
        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }

    public void printElements() {
        Element<T> p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    public MyList<T> insert(T text) {
        Element<T> p = new Element<>();
        p.data = text;

        p.next = head;
        head = p;
        count++;
        if (p.next != null) {
            p.next.prev = p;
        } else {
            tail = p;
        }
        return this;
    }

    public MyList<T> append(T text) {
        Element<T> p = new Element<>();
        p.data = text;

        p.prev = tail;
        tail = p;
        count++;
        if (p.prev != null)
            p.prev.next = p;
        else
            head = p;

        return this;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Element p = head;

        while (p != null) {
            result.append(p.data);
            if (p.next != null) {
                result.append(", ");
            } else {
                result.append(".");
            }
            p = p.next;
        }
        return result.toString();
    }
}
