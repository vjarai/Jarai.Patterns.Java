/*
 * Created on 27.03.2004
 *
 */
package behavioral.chainOfResponsibility;


public class Application {

    public static void main(String[] args) {

        // Firma anlegen
        Firma meineFirma = new Firma("ABC GmbH");

        // Vetrieb zur Firma hinzufuegen
        Abteilung vertrieb = new Abteilung("Vertrieb");
        vertrieb.hinzufuegenBearbeiter(new Putzfrau("Putzfrau Schulz"));
        vertrieb.hinzufuegenBearbeiter(new Verkaeufer("Verkaeufer Mueller"));
        meineFirma.hinzufuegenBearbeiter(vertrieb);

        // Buchhaltunggsabteilung zur Firma hinzufuegen
        Abteilung buchhaltung = new Abteilung("Buchhaltung");
        buchhaltung.hinzufuegenBearbeiter(new Putzfrau("Putzfrau Schmidt"));
        buchhaltung.hinzufuegenBearbeiter(new Buchhalter("Buchhalter Meier"));
        meineFirma.hinzufuegenBearbeiter(buchhaltung);

        meineFirma.bearbeitenAnfrage("Kontostand");
        meineFirma.bearbeitenAnfrage("Preis");
        meineFirma.bearbeitenAnfrage("Sinn des lebens");
    }
}
