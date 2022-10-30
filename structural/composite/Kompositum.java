/*
 * Created on 21.03.2004
 *
 */
package structural.composite;

import java.util.LinkedList;


public abstract class Kompositum extends Komponente {

    protected final LinkedList<Komponente> komponentenListe = new LinkedList<>();        // Component interface

    public Kompositum(double preis) {
        super(preis);
    }

    void anzeigen() {
        super.anzeigen();
        Komponente komponente;

        for (Komponente value : komponentenListe) {
            komponente = value;
            komponente.anzeigen();
        }

    }

    void hinzufuegen(Komponente komponente) {
        komponentenListe.add(komponente);
    }

}