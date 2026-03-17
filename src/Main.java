import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Main {
    public static void checkAge(int age) throws TooYoungException{
        if (age < 18){ throw new TooYoungException("Возраст " + age + "меньше 18"); }
        else {
            System.out.println("Возраст ок");
        }
    }
    public static class TooYoungException extends Exception{
        public TooYoungException(String message){
            System.out.println("Возраст слишком мал");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (TooYoungException e){
            System.out.println("Ошибка: " + e);
        }


    }
}
