import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = List.of("alex", "john", "mike");

        List<String> result = names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(result);
    }
}
