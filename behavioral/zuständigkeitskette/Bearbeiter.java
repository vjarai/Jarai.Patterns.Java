/*
 * Created on 27.03.2004
 *
 */
package behavioral.zuständigkeitskette;

import java.util.Vector;
/**
 * @author Viktor
 *
 */
public class Bearbeiter {

	protected final Vector<Bearbeiter> helfer = new Vector<>();
	protected final String name;

	/**
	 * 
	 */
	public Bearbeiter(String name) {
		this.name = name;
	}

	void hinzufügenBearbeiter(Bearbeiter bearbeiter) {
		this.helfer.add( bearbeiter );
	}

	boolean bearbeitenAnfrage(String anfrage) {
		
		// Weiß der Bearbeiter die Antwort selbst?
		if( anfrage.equals("Testfrage"))
		{
			System.out.println( name + " kennt die Antwort zu " + anfrage );
			return true;
		}
		
		// Nein, dann alle Bekannten fragen... 
		for (Bearbeiter bearbeiter : helfer) {
			if (bearbeiter.bearbeitenAnfrage(anfrage))
				return true;
		}
	//	keiner hat es gewusst...
		System.out.println( name + " kennt " + anfrage +" nicht." );
		return false;
	}
}
