package jarai.patterns.gof.behavioral.visitor;


public abstract class Besucher {

    void besuche(IVisitable kfz) {

    }

    abstract void besuche(Lkw e);

    abstract void besuche(Bus e);
}
