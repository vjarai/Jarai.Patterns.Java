/*
 * Created on 28.03.2004
 *
 */
package behavioral.schablonenmethode;


public abstract class Anwendung {

    /**
     *
     */

    protected int x, y, z;

    public Anwendung() {
    }

    // Die abstrakten Operationen muessen in abgel. Klassen implementiert werden
    abstract void einlesenDaten();

    abstract void ausgebenDaten(int z);

    // Die Schablonenmethode definiert einen festen Algorithmus
    final void schablonenMethode() {
        einlesenDaten();        // Die Details werden in abgel. Klassen definiert

        z = x + y;                // Ergebnis berechnen

        ausgebenDaten(z);        //
    }

}