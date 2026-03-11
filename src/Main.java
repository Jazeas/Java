public class Main {
    private double balance;
    private double hold;

    public Main(double initialBalance) {
        this.balance = initialBalance;
        this.hold = 0;

    }

    public void hold(double amount){
        AssertAmountIsPositive(amount);
        AssertBalanceIsSufficient(amount);

        balance -= amount;
        hold += amount;

        System.out.println("✓ Заморожено: " + amount);
        System.out.println("  Доступно: " + balance);
        System.out.println("  Заморожено всего: " + hold);
        System.out.println("--------------------");
    }
    private void AssertAmountIsPositive(double amount){
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма должна быть положительной: " + amount);
        }
    }
    private void AssertBalanceIsSufficient(double amount){
        if (amount > balance) {
            throw new IllegalArgumentException("Недостаточно средств. Доступно: " + balance + ", запрошено: " + amount);
        }
    }

    public double getBalance(){return balance;}
    public double getHold(){return hold;}

    public static void main(String[] args){

       Main account = new Main(1000);

        System.out.println("=== Начальное состояние ===");
        System.out.println("Баланс: " + account.getBalance());
        System.out.println("Заморожено: " + account.getHold());
        System.out.println("====================\n");

        account.hold(200);

        account.hold(200);

        try {
            account.hold(700);
        } catch ( IllegalArgumentException e ) {
            System.out.println("❌ Ошибка: " + e.getMessage());
        }

        System.out.println("\n=== Итоговое состояние ===");
        System.out.println("Баланс: " + account.getBalance());
        System.out.println("Заморожено: " + account.getHold());

    }

}