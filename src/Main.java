import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {

    public static void main(String[] args) throws IOException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> {
                    System.out.println("task 1");
                }
        );
        executor.submit(() -> {
                    System.out.println("task 2");
                }
        );
        executor.submit(() -> {
                    System.out.println("task 3");
                }
        );
        executor.shutdown();
}}
