/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public class DamenKleiderfabrik extends Kleiderfabrik {

	Hemd erzeugeHemd() {
		
		return new DamenHemd("Bluse", 38);
	}

	Hose erzeugeHose() {
		return new DamenHose("Rock", 38);
	}

}
