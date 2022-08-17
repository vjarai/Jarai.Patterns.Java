/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public class DamenHemd extends Hemd {
	
	DamenHemd(String bezeichnung, int kragenweite) {
			super( bezeichnung, kragenweite);
		}
	void anzeigen() {
			System.out.println("Damenhemd: " + super.bezeichnung +", Gr��e: " + super.kragenweite);
		}

}
