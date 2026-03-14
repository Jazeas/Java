public class Main {
    public static class Calculator{
        public int multiply(int a, int b){
            return a * b;
        }
        public double multiply(double a, double b){
            return a * b;
        }
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.multiply(23.6, 45));
        System.out.println(calc.multiply(5,8));
    }
}