/*
 * Created on 29.03.2004
 *
 */
package behavioral.visitor;


public class Lkw extends Fahrzeug {

    private final double doubleDaten;

    Lkw(double doubleDaten) {
        this.doubleDaten = doubleDaten;
    }

    public double getDoubleDaten() {
        return doubleDaten;
    }

    void acceptVisitor(Besucher besucher) {
        besucher.besuche(this);
    }

}