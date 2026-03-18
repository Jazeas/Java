import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        Files.write(
                Paths.get("file.txt"),
                List.of("Hello, File I/O!")
        );
}}
