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
	 * @param größe
	 */
	public HerrenHose(String bezeichnung, int größe) {
		super(bezeichnung, größe);
		}
	
	void anzeigen() {
			System.out.println("Herrhose: " + super.bezeichnung +", Größe: " + super.größe);
		}
}
