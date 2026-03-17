import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "abc";
        int result = 0;

        try {
            System.out.println("Работа над строкой " + s1 + " ...");
            int num1 = Integer.parseInt(s1);
            System.out.println(num1);
        } catch (NumberFormatException e ){
            System.out.println("Неправильный формат: " + s1);
        }
        try {
            System.out.println("Работа над строкой " + s2 + " ...");
            int num2 = Integer.parseInt(s2);
            System.out.println(num2);
        } catch (NumberFormatException e ){
            System.out.println("Неправильный формат: " + s2);
        }

    }
}
