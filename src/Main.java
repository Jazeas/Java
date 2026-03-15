import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Москва");
        list.add("Питер");
        list.add("Самара");
        list.add("Таганрок");
        list.add("Владивосток");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("========");

        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("========");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
