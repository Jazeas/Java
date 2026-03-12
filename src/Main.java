public class Main {
    public static class Vehicle{
        String brand;
        int speed;
    }

    public static class Car extends Vehicle{
        int fuelType;
    }
    public static class Bicycle extends Vehicle {
        boolean hasBell;
    }
    public static void main(String[] args){
        Car car = new Car();
        car.brand = "toyota";
        car.speed = 130;
        car.fuelType = 95;

        Bicycle bicycle = new Bicycle();
        bicycle.brand = "Stels";
        bicycle.speed = 30;
        bicycle.hasBell = true;

        System.out.println(car.brand + " " + car.speed + " " + car.fuelType);

        System.out.println(bicycle.brand + " " + bicycle.speed + " " + bicycle.hasBell);
    }
}