
package creational.erbauer;

public class TestTreiber {

	public static void main(String[] args) {
		
		int auswahl = 1;
		Koch koch;
		
		// Erbauer (Koch) auswählen
		if( auswahl == 1)
			koch  = new ItalienischerKoch();
		else
			koch = new DeutscherKoch();
			
		KüchenChef küchenChef = new KüchenChef( koch );
		
		// Direktor erstellt eine komplexe Mahlzeit
		küchenChef.erstelleMahlzeit();
		
		System.out.println( koch.getMahlzeit() );		
	}
}
