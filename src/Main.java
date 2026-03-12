public class Main {
    public static class Thermostat{

        private int temperature;

        public int startTemperature(){
            temperature = 50;
            return temperature;
        }

        public int getTemperature(){

            return temperature;
        }

        public int setTemperature(int amount){
            if(amount >= -50 && amount <= 50){
                temperature = amount;
                System.out.println("Температура изменена на " + amount);
            } else {
                System.out.println("Температура должна быть в диапазоне от -50 до +50 градусов");
            }
            return temperature;
        }

    }

    public static void main(String[] args){
        Thermostat t = new Thermostat();
        t.startTemperature();
        System.out.println(t.getTemperature());
        t.setTemperature(25);
        t.setTemperature(-50);
        System.out.println(t.getTemperature());
    }
}