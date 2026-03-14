public class Main {
    public static class Box<T>{
        T value;

        void set(T value){
            this.value = value;
        }
        T get(){
            return value;
        }
    }
    public static void main(String[] args){
        Box<String> box = new Box<>();
        box.set("Hello");
        String s = box.get();
        System.out.println(box.get());

        Box<Integer> box1 = new Box<>();
        box1.set(10);
        System.out.println(box1.get());
    }
}
