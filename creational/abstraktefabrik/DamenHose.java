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

	public DamenHose(String bezeichnung, int größe) {
		super(bezeichnung, größe);
	}
	
	void anzeigen() {
			System.out.println("Damenhose: " + super.bezeichnung +", Größe: " + super.größe);
		}

}
