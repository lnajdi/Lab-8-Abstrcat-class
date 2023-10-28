public class App {
    public static void main(String[] args) throws Exception {
        Lapin lapin = new Lapin();
        lapin.fuir();

        Lion lion = new Lion();
        lion.chasser();

        Poisson poisson = new Poisson();
        poisson.fuir();
        poisson.chasser();
    }
}

