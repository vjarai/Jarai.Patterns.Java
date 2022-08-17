/*
 * Created on 28.03.2004
 *
 */
package behavioral.schablonenmethode;

/**
 * @author Viktor
 *
 */
public abstract class Anwendung {

	/**
	 * 
	 */
	
	protected int x,y,z;
	
	public Anwendung() {
	}

	// Die abstrakten Operationen müssen in abgel. Klassen implementiert werden
	abstract void einlesenDaten();
	abstract void ausgebenDaten(int z);

	// Die Schablonenmethode definiert einen festen Algorithmus
	final void schablonenMethode() {	
		einlesenDaten();		// Die Details werden in abgel. Klassen definiert 
		
		 z = x + y;				// Ergebnis berechnen
		 
		ausgebenDaten(z);		// 
	}

}