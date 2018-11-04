import sda.java12poz.structures.MyList;

public class Main {

    public static void main(String[] args) {

        MyList<Integer> list = new MyList<>();

        list.append(12).append(12).insert(12);


        System.out.println(list);

    }
}
