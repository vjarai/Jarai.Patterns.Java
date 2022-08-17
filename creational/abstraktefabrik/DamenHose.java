/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public class DamenHose extends Hose {

	public DamenHose(String bezeichnung, int gr��e) {
		super(bezeichnung, gr��e);
	}
	
	void anzeigen() {
			System.out.println("Damenhose: " + super.bezeichnung +", Gr��e: " + super.gr��e);
		}

}
