
package jarai.patterns.gof.behavioral.visitor;


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