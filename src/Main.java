import java.io.IOException;


public class Main {
    static class MyRunnable implements Runnable{

        public void run(){
            System.out.println("Hello from thread");
        }
    }
    public static void main(String[] args) throws IOException {
    Thread t = new Thread(new MyRunnable());
    t.start();
}}
