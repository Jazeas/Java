import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Main {

    public static void main(String[] args){

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        System.out.println(nums.get(0) + " " + nums.get(2) +" " + nums.getLast());

        nums.set(1,99);

        nums.addFirst(5);

        System.out.println(nums.get(0) + " " + nums.get(2));

        System.out.println(nums);


    }
}
