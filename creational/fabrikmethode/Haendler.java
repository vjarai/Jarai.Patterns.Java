/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;


public abstract class Haendler {

    protected final String standort;

    Haendler(String standort) {
        this.standort = standort;
    }

    abstract Produkt verkaufen(); // abstrakte Fabrikmethode, Produkt wird beim Haendler erzeugt (new)

    void anzeigen() {
    }

}