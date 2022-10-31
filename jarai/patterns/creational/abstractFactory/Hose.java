
package jarai.patterns.creational.abstractFactory;


public abstract class Hose {

    protected final int groesse;
    protected final String bezeichnung;

    Hose(String bezeichnung, int groesse) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
    }

    abstract void anzeigen();

}