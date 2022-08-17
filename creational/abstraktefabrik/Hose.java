/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public abstract class Hose {

	protected final int größe;
	protected final String bezeichnung;

	Hose(String bezeichnung, int größe) {
		this.bezeichnung = bezeichnung;
		this.größe = größe;
	}

	abstract void anzeigen();

}