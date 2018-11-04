package sda.java12poz.structures;

public class MyList {
    public Element head = null;
    public Element tail = null;
    public int count = 0;

    public void printElementsRev() {
        Element p = tail;
        while (p != null) {
            System.out.println(p.data);
            p = p.prev;
        }
    }

    public void printElements() {
        Element p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    @Override
    public String toString() {
        String result = "";
        Element p = head;

        while (p != null) {
            // dodanie p.data na koniec result
            result = result + p.data + ", ";
            p = p.next;
        }
        return result;
    }
}
