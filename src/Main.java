public class Main {
    public interface Animal{ void sayName (); void makeSound();}
    public static class Dog implements Animal {
        @Override
        public void sayName(){
            System.out.println("Собайка");
        }
        @Override
        public void makeSound(){
            System.out.println("Гау");
        }
    }
    public static class Cat implements Animal {
        @Override
        public void sayName(){
            System.out.println("Котейка");
        }
        @Override
        public void makeSound(){
            System.out.println("Мяу");
        }
    }
    public static class Cow implements Animal {
        @Override
        public void sayName(){
            System.out.println("Коровка");
        }
        @Override
        public void makeSound(){
            System.out.println("муу");
        }
    }

    public static void main(String[] args){
        Animal[] a = {
                new Cat(),
                new Dog(),
                new Cow()
        };
        for(Animal animal : a){
            animal.sayName();
            animal.makeSound();

        }
    }
}