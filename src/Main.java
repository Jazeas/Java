import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<String> up = new ArrayList<>();

        up.add("кот");
        up.add("собака");
        up.add("слон");
        up.add("тигр");
        up.add("лев");

        for (int i = 0; i < up.size(); i++) {
            String original = up.get(i);
            up.set(i, original.toUpperCase());
        }
        System.out.println(up);

        List<String> uplen = new ArrayList<>();
        for (int i = 0; i < up.size(); i++) {
            int len = up.get(i).length();
            uplen.add(String.valueOf(len));
        }
        System.out.println(uplen);
    }
}
