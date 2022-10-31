/*
 * Created on 29.03.2004
 *
 */
package behavioral.visitor;


public abstract class Fahrzeug implements IVisitable {

    abstract void acceptVisitor(Besucher besucher);

}