public class Main {
    public static class BankAccount{
        private int accountNumber;
        private double balance;

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance(){
            return balance;
        }

        public double deposit(double amount){
            if(amount > 0){
                balance += amount;
            } else {System.out.println("Сумма для депозита не может быть меньше или равна нулю!");}
            return balance;
        }
        public double withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
            } else{
                System.out.println("Сумма снятия не может превышать текущий баланс!");
            }
            return balance;
        }
    }
    public static void main(String[] args){
        BankAccount max = new BankAccount();

        max.setBalance(1000);
        max.deposit(1000);
        System.out.println(max.getBalance());
        max.withdraw(3000);
        max.withdraw(500);
        System.out.println(max.getBalance());
    }
}