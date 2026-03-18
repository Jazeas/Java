import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Files.write(Path.of("numbers.txt"), List.of("5", "10", "15", "20"));
        List<String> stringNumbers = Files.readAllLines(Path.of("numbers.txt"));

        int sum = 0;
        for(String s : stringNumbers){
            sum += Integer.parseInt(s);
        }
        Files.write(Path.of("sum.txt"), List.of(String.valueOf(sum)));
        System.out.println(sum);
}}
