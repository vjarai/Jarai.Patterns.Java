/*
 * Created on 21.03.2004
 *
 */
package structural.proxy;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		Datenbank 		meineDatenbank = new Datenbank();
		DatenbankProxy 	meinDatenbankProxy = new DatenbankProxy( meineDatenbank );
		String			record;		
		Datenbank 		verwendeteDatenbank;
		
		//verwendeteDatenbank = meineDatenbank;
		verwendeteDatenbank = meinDatenbankProxy;	// Proxy kann statt Datenbank verwendet werden
		
		// Datenbankabfrage durchf�hren
		record = verwendeteDatenbank.abfragenDaten( 500 );
		System.out.println("Ergebnis: " + record );
		
		// Daten k�nnen bei dem zweiten Aufruf aus dem Cache geliefert werden
		record = verwendeteDatenbank.abfragenDaten( 500 );
		System.out.println("Ergebnis: " + record );
		
		// Zugriff auf "vertrauliche" Daten:
		record = verwendeteDatenbank.abfragenDaten( 0 );
		System.out.println("Ergebnis: " + record );
		
		// Kosten anzeigen
		meineDatenbank.zeigeAbfragekosten();
		
	}
}
