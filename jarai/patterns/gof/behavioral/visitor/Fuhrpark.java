package jarai.patterns.gof.behavioral.visitor;

import java.util.Iterator;
import java.util.Vector;

public class Fuhrpark implements Iterable<Fahrzeug> {

    public Vector<Fahrzeug> fahrzeuge = new Vector<Fahrzeug>();


    public void add(Fahrzeug fahrzeug) {
        fahrzeuge.add(fahrzeug);
    }

    @Override
    public Iterator<Fahrzeug> iterator() {
        return fahrzeuge.iterator();
    }
}
