import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> filt = new ArrayList<>();
        filt.add(9);
        filt.add(11);
        filt.add(11);
        filt.add(11);
        filt.add(22);
        filt.add(3);
        filt.add(45);
        filt.add(12);
        filt.add(6);
        filt.add(31);

//        for (int i = filt.size() - 1; i >= 0; i--) {
//            if(filt.get(i) > 10){
//            } else {
//                filt.remove(i);
//
//            }
//        }


        System.out.println(filt);
        for (int i = filt.size() - 1; i >= 0; i--) {
            if(filt.get(i) % 3 != 0 || filt.get(i) > 10){}
            else{filt.remove(i);}
        }
        System.out.println("И не делятся на 3 и больше 10: "+filt);
    }
}
