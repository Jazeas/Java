import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("Alex", "John", "Mike", "Bob");
        List<String> result =
        names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
