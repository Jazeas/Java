public class Main {
    public static abstract class Vehicle{
        private String brand;

        public void setBrand(String brand){
            this.brand = brand;
        }
        public abstract void move();
    }
    public static class Car extends Vehicle{
        @Override
        public void move(){
            System.out.println("Машина едет по дороге");
        }
    }
    public static class Bike extends  Vehicle{
        @Override
        public void move(){
            System.out.println("Велосипед крутит педали");
        }
    }
    public static void main(String[] args){
        Vehicle[] vehicles = {
                new Car(),
                new Bike()
        };
        for( Vehicle veh : vehicles){
            veh.move();
        }
    }
}