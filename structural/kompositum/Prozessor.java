/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;

/**
 * @author Viktor
 *
 */
public class Prozessor extends Komponente  {

	private final int mhz;

	/**
	 * 
	 */
	public Prozessor(int mhz, double preis) {
		super( preis );
		this.mhz = mhz;
		
	}

	void anzeigen() {
		System.out.print( "Prozessor mit " + mhz + " Mhz " );
		super.anzeigen();
	}

}