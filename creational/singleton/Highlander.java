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

	private static Highlander präsident;		// statisches Attribut (Klassenvariable)

	private Highlander() {
		System.out.println("Präsident wird erzeugt.");
	}


	static Highlander getInstance() {		// statische Methode (Klassenfunktion)
		
		if ( präsident == null )			// existiert bereits ein Präsident?
		{
			präsident = new Highlander();	// nein, dann neu anlegen.
		}
		
		return präsident;					// den einzigen Präsidenten zurückliefern.
	}

	void anzeigen() {
		System.out.println("Guten Tag, ich bin der EINZIGE Präsident.");
	}

}
