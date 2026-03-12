public class Main {
    public static class Employee {
        private String name;
        private int baseSalary;

        public Employee(String name, int baseSalary){
            this.name = name;
            this.baseSalary = baseSalary;
        }

        public String getName(){
            return name;
        }

        public int getBaseSalary() {
            return baseSalary;
        }

        public int calculateSalary(){
            return baseSalary;
        }
    }
    public static class Manager extends Employee {
        public Manager(String name, int baseSalary){
            super(name,baseSalary);
        }

        @Override
        public int calculateSalary(){
            return super.calculateSalary() + 20000;
        }
    }
    public static class Intern extends Employee {
        public Intern(String name, int baseSalary){
            super(name,baseSalary);
        }

        @Override
        public int calculateSalary(){
            return super.calculateSalary() / 2;
        }
    }
    public static void main(String[] args){
            Employee[] employees = {
                    new Manager("Директор",100000),
                    new Intern("Стажер Петя", 30000),
                    new Intern("Стажер Ваня", 50000)
            };
            for(Employee emp : employees){
                System.out.println(emp.getName() + ": " + emp.calculateSalary());
            }
    }
}