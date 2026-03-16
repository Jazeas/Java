import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> words = List.of("Java", "Python", "JS", "Go");

        List<String> result = words.stream().filter(n -> n.length() > 3).collect(Collectors.toList());
        System.out.println(result);
    }
}
