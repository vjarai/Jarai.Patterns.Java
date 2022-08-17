/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;

/**
 * @author Viktor
 *
 */
public abstract class Produkt {

	private final double preis;

	private final String bezeichnung;

	abstract void benutzen();

	Produkt(String bezeichnung, double preis) {
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}

	double getPreis() {
		return this.preis;
	}

}