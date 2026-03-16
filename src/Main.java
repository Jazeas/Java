import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 10, 15, 20, 25);

        List<Integer> result =
        numbers.stream()
                .filter(n -> n > 10)
                .toList();
        System.out.println(result);

    }
}
