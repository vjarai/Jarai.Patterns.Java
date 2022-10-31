/*
 * Created on 21.03.2004
 *
 */
package behavioral.observer;


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
