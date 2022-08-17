
package creational.erbauer;

public class TestTreiber {

	public static void main(String[] args) {
		
		int auswahl = 1;
		Koch koch;
		
		// Erbauer (Koch) ausw�hlen
		if( auswahl == 1)
			koch  = new ItalienischerKoch();
		else
			koch = new DeutscherKoch();
			
		K�chenChef k�chenChef = new K�chenChef( koch );
		
		// Direktor erstellt eine komplexe Mahlzeit
		k�chenChef.erstelleMahlzeit();
		
		System.out.println( koch.getMahlzeit() );		
	}
}
