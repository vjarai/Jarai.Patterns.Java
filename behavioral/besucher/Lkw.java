/*
 * Created on 29.03.2004
 *
 */
package behavioral.besucher;


public class Lkw extends Fahrzeug {

    private final double doubleDaten;

    Lkw(double doubleDaten) {
        this.doubleDaten = doubleDaten;
    }

    public double getDoubleDaten() {
        return doubleDaten;
    }

    void nimmEntgegen(Besucher besucher) {
        besucher.besuche(this);
    }

}