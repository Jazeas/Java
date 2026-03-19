import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static class Counter{
        int value;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (counter){
                counter.value++;}
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (counter){
                    counter.value++;}
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.value);


}}
