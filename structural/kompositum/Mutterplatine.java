/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;

/**
 * @author Viktor
 *
 */
public class Mutterplatine extends Kompositum {

	private final String hersteller;

	/**
	 * 
	 */
	public Mutterplatine(String hersteller, double preis) {
		super( preis );
		this.hersteller = hersteller;
	}

	void anzeigen() {
		System.out.print("Mutterplatine von " + hersteller );
		super.anzeigen();
	}

}
