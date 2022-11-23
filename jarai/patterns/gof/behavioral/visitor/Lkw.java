package jarai.patterns.gof.behavioral.visitor;


public class Lkw implements IVisitable {

    public void acceptVisitor(Besucher besucher) {

        besucher.besuche(this);
    }

}