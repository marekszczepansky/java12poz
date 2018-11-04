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

    public MyList insert(String text) {
        Element p = new Element();
        p.data = text;


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
