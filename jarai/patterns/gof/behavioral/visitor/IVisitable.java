package jarai.patterns.gof.behavioral.visitor;

public interface IVisitable {
    void acceptVisitor(Besucher besucher);
}
