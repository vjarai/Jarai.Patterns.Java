/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;


public abstract class Produkt {

    private final double preis;

    private final String bezeichnung;

    Produkt(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    abstract void benutzen();

    double getPreis() {
        return this.preis;
    }

}