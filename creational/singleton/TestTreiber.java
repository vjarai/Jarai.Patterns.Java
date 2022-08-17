/*
 * Created on 21.03.2004
 *
 */
package creational.singleton;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		
		// Geht NICHT, da Konstruktor der KLasse Präsident private ist.
		// Präsident p = new Präsident();	
		
		// Aufruf der Klassenfunktion getInstance()
		Highlander p = Highlander.getInstance();	// Präsident wird erstellt...
		
		
		p = Highlander.getInstance();			// vorhandener Präsident wird zurückgeliefert.
	
		p.anzeigen();	
		 
	}
}
