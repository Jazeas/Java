public class Main {
    public static class ElevatorButton{
        private int targetFloor;

        public int getTargetFloor(){
            System.out.println(targetFloor);
            return targetFloor;
        }

        public void setTargetFloor(int targetFloor) {
            if(targetFloor >=0 && targetFloor <= 20){
                System.out.println("Вы успешно поднялись на этаж: " + targetFloor);
                this.targetFloor = targetFloor;
            }else{
                System.out.println("Ошибка! этажи в диапазоне от 0 - 20, а указанный этаж: " + targetFloor);
            }
        }
    }
    public static void main(String[] args){
        ElevatorButton button = new ElevatorButton();

        button.setTargetFloor(-12);

        button.getTargetFloor();

        button.setTargetFloor(13);

    }

}