package jarai.patterns.gof.behavioral.observer;


public class Application {

    public static void main(String[] args) {

        var aktie = new Aktie();
        var beobachter = new Beobachter();

        aktie.addPropertyChangeListener(beobachter);

        aktie.setKurs(100);

    }
}
