/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;

/**
 * @author Viktor
 *
 */
public class Komponente {

	protected final double preis;

	/**
	 * 
	 */
	public Komponente( double preis) {
		this.preis = preis;
	}

	void anzeigen() {
		System.out.println(" zum Preis von: " + preis + " EUR.");
	}

}
