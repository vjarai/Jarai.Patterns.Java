
package jarai.patterns.gof.behavioral.visitor;


public class Bus extends Fahrzeug {

    private final int intDaten;

    Bus(int intDaten) {
        this.intDaten = intDaten;
    }

    public int getIntDaten() {
        return intDaten;
    }

    void acceptVisitor(Besucher besucher) {
        besucher.besuche(this);

    }

}