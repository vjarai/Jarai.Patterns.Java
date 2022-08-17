/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public class HerrenHose extends Hose {

	/**
	 * @param bezeichnung
	 * @param gr��e
	 */
	public HerrenHose(String bezeichnung, int gr��e) {
		super(bezeichnung, gr��e);
		}
	
	void anzeigen() {
			System.out.println("Herrhose: " + super.bezeichnung +", Gr��e: " + super.gr��e);
		}
}
