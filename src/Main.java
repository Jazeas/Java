import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static int divide(int a, int b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("Деление на ноль невозможно");
            return 0;
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int result = divide(a,b);
        System.out.println(result);

    }
}
