public class Main {
    public static interface PaymentMethod{void pay(double amount);}

    public static class CreditCard implements PaymentMethod{
        @Override
        public void pay(double amount){
            System.out.println("Оплата картой прошла успешно. Сумма: "+ amount);
        }
    }
    public static class PayPal implements PaymentMethod{
        @Override
        public void pay(double amount){
            System.out.println("Оплата через PayPal прошла успешно. Сумма: " + amount);
        }
    }
    public static class Cash implements PaymentMethod{
        @Override
        public void pay(double amount){
            System.out.println("Оплата наличными прошла успешно. Сумма: " + amount);
        }
    }
    public static void main(String[] args){
        PaymentMethod[] any = {
                new CreditCard(),
                new PayPal(),
                new Cash()
        };
        for(PaymentMethod anyone: any){
            anyone.pay(1000);
        }
    }
}