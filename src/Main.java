public class Main {
    public static class Shape{
        public double getArea(){
            return 0;
        }
    }
    public static class Circle extends Shape{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return radius * radius * Math.PI;
        }
    }

    public static class Rectangle extends  Shape{
        private double width;
        private double height;

        public Rectangle(double width, double height){
            this.width = width;
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }
    public static void main(String[] args){
        Shape[] s = {
                new Circle(5),
                new Rectangle(10,4),
                new Circle(9)
        };
        for(Shape shape : s) {
            System.out.println("Площадь: " + shape.getArea());
        }
    }
}