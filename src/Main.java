
public class Main {
    static class Animal { }
    static class Mammal extends Animal { }
    static class Dog extends Mammal { }
    static class Cat extends Mammal { }
    public static class Box<T>{
        private T content;
        public void put(T item){
            this.content = item;
        }
        public T get(){
            return content;
        }
        public boolean isEmpty(){
            return content == null;
        }
    }
    public static <T> void move(Box<? extends T> src, Box<? super T> dest){
        if(!src.isEmpty()){
            T item = src.get();

            dest.put(item);

            src.put(null);

            System.out.println("Перемещено успешно!");
        }else {
            System.out.println("Исходная коробка пуста!");
        }
    }
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();

        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Mammal> mammalBox = new Box<>();

        dogBox.put(dog);
        System.out.println("dogBox пуст? " + dogBox.isEmpty());

        System.out.println("Перемещаем собаку в animalBox");
        move(dogBox, animalBox);

        System.out.println("dogBox пуст? " + dogBox.isEmpty());
        System.out.println("animalBox пуст? " + animalBox.isEmpty());

        System.out.println("Перемещение кошки");
        catBox.put(cat);

        System.out.println("catBox пуст? " + catBox.isEmpty());
        move(catBox, mammalBox);

        System.out.println("mammalBox пуст? " + mammalBox.isEmpty());

    }
}
