
package jarai.patterns.behavioral.observer;


public class Firma extends Beobachter {

    private final Wechselkurs wechselkurse;
    private double dollarkurs;

    Firma(Wechselkurs wechselkurse) {
        this.wechselkurse = wechselkurse;
    }

    void aktualisieren() {
        dollarkurs = wechselkurse.getDollarkurs();
    }

    void anzeigen() {
        System.out.println("gespeicherter Kurs " + dollarkurs);
    }

}
