import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> result =
        numbers.stream()
                .map(n -> n * 2)
                .toList();
        System.out.println(result);

    }
}
