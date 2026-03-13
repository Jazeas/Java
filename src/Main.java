public class Main {
    public static interface Notifier{void send(String message);}

    public static class EmailNotifier implements Notifier{
        @Override
        public void send(String message){
            System.out.println("Сообщение " + message + " отправлено на почту");
        }
    }

    public static class SMSNotifier implements Notifier{
        @Override
        public void send(String message){
            System.out.println("Сообщение " + message + " отправлено по SMS");
        }
    }

    public static class PushNotifier implements Notifier{
        @Override
        public void send(String message){
            System.out.println("Сообщение " + message + " отправлено пуш-уведомлением");
        }
    }
    public static void main(String[] args){
        Notifier[] not = {
                new EmailNotifier(),
                new SMSNotifier(),
                new PushNotifier()
        };
        for( Notifier b : not){
            b.send("А вы уже увидели эти вкусные цены?");
        }
    }
}