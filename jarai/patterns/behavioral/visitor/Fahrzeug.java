
package jarai.patterns.behavioral.visitor;


public abstract class Fahrzeug implements IVisitable {

    abstract void acceptVisitor(Besucher besucher);

}