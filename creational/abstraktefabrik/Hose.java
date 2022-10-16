/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;


public abstract class Hose {

    protected final int groesse;
    protected final String bezeichnung;

    Hose(String bezeichnung, int groesse) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
    }

    abstract void anzeigen();

}