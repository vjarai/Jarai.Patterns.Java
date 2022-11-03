
package jarai.patterns.gof.behavioral.visitor;


public abstract class Fahrzeug implements IVisitable {

    abstract void acceptVisitor(Besucher besucher);

}