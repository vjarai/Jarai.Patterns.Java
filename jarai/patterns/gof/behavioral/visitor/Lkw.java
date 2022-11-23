
package jarai.patterns.gof.behavioral.visitor;


public class Lkw extends Fahrzeug {

    public void acceptVisitor(Besucher besucher) {
        besucher.besuche(this);
    }

}