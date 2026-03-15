import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args){
        List<Integer> duplicate = new ArrayList<>();
        List<Integer> withoutDuplicates = new ArrayList<>();

        duplicate.add(1);
        duplicate.add(3);
        duplicate.add(5);
        duplicate.add(3);
        duplicate.add(7);
        duplicate.add(1);
        duplicate.add(9);
        duplicate.add(5);
        duplicate.add(3);

        for(int forcheck : duplicate){
            if(!withoutDuplicates.contains(forcheck)){
                withoutDuplicates.add(forcheck);
            }
        }
        System.out.println("Список без повторений + сохранен порядок первых вхождений: "+withoutDuplicates);
    }
}
