package jarai.patterns.gof.behavioral.visitor;

import java.util.Vector;

public class Fuhrpark {

    public Vector<IVisitable> fahrzeuge = new Vector<>();

    public void add(IVisitable fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    public void acceptVisitor(Visitor visitor) {
        for (IVisitable fahrzeug : fahrzeuge) {
            fahrzeug.acceptVisitor(visitor);
            //visitor.visit(fahrzeug);
        }
    }
}
