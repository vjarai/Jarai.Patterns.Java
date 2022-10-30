/*
 * Created on 21.03.2004
 *
 */
package structural.proxy;


public class TestTreiber {

    public static void main(String[] args) {
        var meineDatenbank = new Datenbank();
        var meinDatenbankProxy = new DatenbankProxy(meineDatenbank);
        String record;
        Datenbank verwendeteDatenbank;

        //verwendeteDatenbank = meineDatenbank;
        verwendeteDatenbank = meinDatenbankProxy;    // Proxy kann statt Datenbank verwendet werden

        // Datenbankabfrage durchfuehren
        record = verwendeteDatenbank.abfragenDaten(500);
        System.out.println("Ergebnis: " + record);

        // Daten koennen bei dem zweiten Aufruf aus dem Cache geliefert werden
        record = verwendeteDatenbank.abfragenDaten(500);
        System.out.println("Ergebnis: " + record);

        // Zugriff auf "vertrauliche" Daten:
        record = verwendeteDatenbank.abfragenDaten(0);
        System.out.println("Ergebnis: " + record);

        // Kosten anzeigen
        meineDatenbank.zeigeAbfragekosten();

    }
}
