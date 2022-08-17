/*
 * Created on 27.03.2004
 *
 */
package behavioral.zuständigkeitskette;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		
		// Firma anlegen
		Firma meineFirma = new Firma("ABC GmbH");
		
		// Vetrieb zur Firma hinzufügen
		Abteilung vertrieb = new Abteilung("Vertrieb");
		vertrieb.hinzufügenBearbeiter( new Putzfrau("Putzfrau Schulz"));
		vertrieb.hinzufügenBearbeiter(new Verkäufer("Verkäufer Müller"));
		meineFirma.hinzufügenBearbeiter( vertrieb );
		
		// Buchhaltunggsabteilung zur Firma hinzufügen
		Abteilung buchhaltung = new Abteilung("Buchhaltung");
		buchhaltung.hinzufügenBearbeiter( new Putzfrau("Putzfrau Schmidt"));
		buchhaltung.hinzufügenBearbeiter(new Buchhalter("Buchhalter Meier"));
		meineFirma.hinzufügenBearbeiter( buchhaltung );

		meineFirma.bearbeitenAnfrage("Kontostand");
		meineFirma.bearbeitenAnfrage("Preis");
		meineFirma.bearbeitenAnfrage("Sinn des lebens");
	}
}
