import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("file.txt");
        List<String> lines = Files.readAllLines(source);

        Path toCopy = Paths.get("copy.txt");
        Files.write(toCopy, lines);
}}
