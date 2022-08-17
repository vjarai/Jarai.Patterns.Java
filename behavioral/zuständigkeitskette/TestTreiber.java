/*
 * Created on 27.03.2004
 *
 */
package behavioral.zust�ndigkeitskette;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		
		// Firma anlegen
		Firma meineFirma = new Firma("ABC GmbH");
		
		// Vetrieb zur Firma hinzuf�gen
		Abteilung vertrieb = new Abteilung("Vertrieb");
		vertrieb.hinzuf�genBearbeiter( new Putzfrau("Putzfrau Schulz"));
		vertrieb.hinzuf�genBearbeiter(new Verk�ufer("Verk�ufer M�ller"));
		meineFirma.hinzuf�genBearbeiter( vertrieb );
		
		// Buchhaltunggsabteilung zur Firma hinzuf�gen
		Abteilung buchhaltung = new Abteilung("Buchhaltung");
		buchhaltung.hinzuf�genBearbeiter( new Putzfrau("Putzfrau Schmidt"));
		buchhaltung.hinzuf�genBearbeiter(new Buchhalter("Buchhalter Meier"));
		meineFirma.hinzuf�genBearbeiter( buchhaltung );

		meineFirma.bearbeitenAnfrage("Kontostand");
		meineFirma.bearbeitenAnfrage("Preis");
		meineFirma.bearbeitenAnfrage("Sinn des lebens");
	}
}
