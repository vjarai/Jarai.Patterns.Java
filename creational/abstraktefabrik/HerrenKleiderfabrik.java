/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;

/**
 * @author Viktor
 *
 */
public class HerrenKleiderfabrik extends Kleiderfabrik {

	/* (non-Javadoc)
	 * @see erzeugungsmuster.abstraktefabrik.Kleiderfabrik#erzeugeHemd()
	 */
	Hemd erzeugeHemd() {
		return new HerrenHemd("mit Muster", 42);
	}

	/* (non-Javadoc)
	 * @see erzeugungsmuster.abstraktefabrik.Kleiderfabrik#erzeugeHose()
	 */
	Hose erzeugeHose() {
		return new HerrenHose("mit Bundfalte", 42);
	}

}
