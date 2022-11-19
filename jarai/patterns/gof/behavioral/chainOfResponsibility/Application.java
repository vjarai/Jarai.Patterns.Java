package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class Application {

    public static void main(String[] args) {

        var meineFirma = new Firma("ABC GmbH");

        meineFirma.einstellen(new Putzfrau("Putzfrau Schulz"));
        meineFirma.einstellen(new Verkaeufer("Verkaeufer Mueller"));
        meineFirma.einstellen(new Buchhalter("Buchhalter Meier"));

        meineFirma.bearbeitenAnfrage("Kontostand");
        meineFirma.bearbeitenAnfrage("Preis");
        meineFirma.bearbeitenAnfrage("Sinn des lebens");
    }
}
