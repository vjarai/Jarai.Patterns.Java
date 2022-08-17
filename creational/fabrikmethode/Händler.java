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
public abstract class H�ndler {

	protected final String standort;

	abstract Produkt verkaufen(); // abstrakte Fabrikmethode, Produkt wird beim H�ndler erzeugt (new)

	H�ndler(String standort) {
		this.standort = standort;
	}

	void anzeigen() {
	}

}