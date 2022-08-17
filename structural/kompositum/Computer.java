/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;

/**
 * @author Viktor
 *
 */
public class Computer extends Kompositum {

	private final String marke;

	/**
	 * 
	 */
	public Computer(String marke, double preis) {
		super( preis );
		this.marke = marke;
	}

	void anzeigen() {
		System.out.print("Computer Marke: " + marke );
		super.anzeigen();
	}

}
