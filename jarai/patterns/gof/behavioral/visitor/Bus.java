package jarai.patterns.gof.behavioral.visitor;


public class Bus implements IVisitable {

    public void acceptVisitor(Besucher besucher) {
        besucher.besuche(this);
    }

}