/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public class HerrenHemd extends Hemd {
	
	HerrenHemd(String bezeichnung, int kragenweite) {
			super( bezeichnung, kragenweite);
		}

	void anzeigen() {
			System.out.println("Herrenhose: " + super.bezeichnung +", Größe: " + super.kragenweite);
		}


}
