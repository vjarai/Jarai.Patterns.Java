/*
 * Created on 21.03.2004
 *
 */
package creational.singleton;

/**
 * @author Viktor
 *
 */
public class Highlander {

	private static Highlander pr�sident;		// statisches Attribut (Klassenvariable)

	private Highlander() {
		System.out.println("Pr�sident wird erzeugt.");
	}


	static Highlander getInstance() {		// statische Methode (Klassenfunktion)
		
		if ( pr�sident == null )			// existiert bereits ein Pr�sident?
		{
			pr�sident = new Highlander();	// nein, dann neu anlegen.
		}
		
		return pr�sident;					// den einzigen Pr�sidenten zur�ckliefern.
	}

	void anzeigen() {
		System.out.println("Guten Tag, ich bin der EINZIGE Pr�sident.");
	}

}
