
package jarai.patterns.gof.creational.abstractFactory;


public abstract class Hemd {

    protected final String bezeichnung;
    protected final int kragenweite;

    Hemd(String bezeichnung, int kragenweite) {
        this.bezeichnung = bezeichnung;
        this.kragenweite = kragenweite;
    }

    abstract void anzeigen();

}