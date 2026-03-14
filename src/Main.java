public class Main {
    public static interface Playable{
        public void play();
    }
    public static class Guitar implements Playable{
        public void play(){
            System.out.println("Гитара играется на струнах");
        }
    }
    public static class Piano implements Playable{
        public void play(){
            System.out.println("Пианино играется на клавишах");
        }
    }
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();

        Piano p = new Piano();
        p.play();
    }
}