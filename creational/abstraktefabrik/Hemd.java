/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;


public abstract class Hemd {

    protected final String bezeichnung;
    protected final int kragenweite;

    Hemd(String bezeichnung, int kragenweite) {
        this.bezeichnung = bezeichnung;
        this.kragenweite = kragenweite;
    }

    abstract void anzeigen();

}