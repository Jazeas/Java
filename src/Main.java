import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args){
        List<String> fruit = new ArrayList<>();

        fruit.add("яблоко");
        fruit.add("банан");
        fruit.add("апельсин");
        fruit.add("банан");
        fruit.add("киви");

        System.out.println("Есть ли яблоко в списке "+fruit.contains("яблоко"));
        System.out.println("Под каким индексом первый банан "+fruit.indexOf("банан"));
        System.out.println("Под каким индексом последний банан "+fruit.lastIndexOf("банан"));

        int count = 0;

        for(String fruits : fruit){
            if(fruits == "банан"){
                count++;
            }
        }
        System.out.println("Бананы встречаются "+count);
    }
}
