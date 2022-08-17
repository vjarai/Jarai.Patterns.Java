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

	protected final int gr��e;
	protected final String bezeichnung;

	Hose(String bezeichnung, int gr��e) {
		this.bezeichnung = bezeichnung;
		this.gr��e = gr��e;
	}

	abstract void anzeigen();

}