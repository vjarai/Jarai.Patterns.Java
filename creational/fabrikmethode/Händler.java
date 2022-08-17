/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;

import java.lang.String;
/**
 * @author Viktor
 *
 */
public abstract class Händler {

	protected final String standort;

	abstract Produkt verkaufen(); // abstrakte Fabrikmethode, Produkt wird beim Händler erzeugt (new)

	Händler(String standort) {
		this.standort = standort;
	}

	void anzeigen() {
	}

}