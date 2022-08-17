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
		
		// Geht NICHT, da Konstruktor der KLasse Pr�sident private ist.
		// Pr�sident p = new Pr�sident();	
		
		// Aufruf der Klassenfunktion getInstance()
		Highlander p = Highlander.getInstance();	// Pr�sident wird erstellt...
		
		
		p = Highlander.getInstance();			// vorhandener Pr�sident wird zur�ckgeliefert.
	
		p.anzeigen();	
		 
	}
}
