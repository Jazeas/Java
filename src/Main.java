import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 10, 15, 20, 25);

        long count =
                numbers.stream().filter(n -> n > 10).count();
        System.out.println(count);
    }
}
