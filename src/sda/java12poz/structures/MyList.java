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

    public MyList<T> insert(T object) {
        Element<T> p = new Element<>();
        p.data = object;

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

    public MyList<T> append(T object) {
        Element<T> p = new Element<>();
        p.data = object;

        p.prev = tail;
        tail = p;
        count++;
        if (p.prev != null)
            p.prev.next = p;
        else
            head = p;

        return this;
    }

    public MyList<T> insertBefore(Element<T> nextElement, T object) {
        Element<T> p = new Element<>();
        p.data = object;

        p.prev = nextElement.prev;
        p.next = nextElement;
        nextElement.prev = p;
        count++;
        if (p.prev != null) {
            p.prev.next = p;
        } else {
            head = p;
        }
        return this;
    }

    public MyList<T> insertAfter(Element<T> prevElement, T object) {
        Element<T> p = new Element<>();
        p.data = object;

        p.prev = prevElement;
        p.next = prevElement.next;
        prevElement.next = p;
        count++;
        if (p.next != null) {
            p.next.prev = p;
        } else {
            tail = p;
        }

        return this;
    }

    public MyList<T> delete(Element<T> e) {
        count--;
        if (e.prev != null){
            e.prev.next = e.next;
        } else {
            head = e.next;
        }
        if (e.next != null) {
            e.next.prev = e.prev;
        } else {
            tail = e.prev;
        }
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
