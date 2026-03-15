import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(12);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);

        List<Integer> chet = new ArrayList<>();
        int sum = 0;
        int max = 0;
        for(int num : numbers){
            if (num % 2 == 0){
                chet.add(num);
                sum += num;
            }
            if (max < num){
                max = num;
            }
        }
        System.out.println(numbers);
        System.out.println("Четные цифры из списка: "+chet);
        System.out.println("Сумма четных чисел равна: "+ sum);
        System.out.println("Максимальный элемент списка: " + max);

    }
}
