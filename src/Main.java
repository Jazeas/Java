import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Spring", "Stream");

        List<Integer> result = words.stream().map(n -> n.length()).collect(Collectors.toList());
        System.out.println(result);
    }
}
