/*
 * Created on 21.03.2004
 *
 */
package behavioral.observer;


public class Firma extends Beobachter {

    private final Wechselkurse wechselkurse;
    private double dollarkurs;

    Firma(Wechselkurse wechselkurse) {
        this.wechselkurse = wechselkurse;
    }

    void aktualisieren() {
        dollarkurs = wechselkurse.getDollarkurs();
    }

    void anzeigen() {
        System.out.println("gespeicherter Kurs " + dollarkurs);
    }

}
