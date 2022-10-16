/*
 * Created on 27.03.2004
 *
 */
package creational.abstraktefabrik;


public class TestTreiber {

    public static void main(String[] args) {

        int auswahl = 0;
        Kleiderfabrik meineKleiderfabrik;

        // Konkrete Fabrik kann zur LAUFZEIT ausgewaehlt werden:
        if (auswahl == 1)
            meineKleiderfabrik = new HerrenKleiderfabrik();
        else
            meineKleiderfabrik = new DamenKleiderfabrik();

        // Konkretefabrik erstellt Instanzen von Hemd/Hose ABGELEITETER Klassen
        Hemd meinHemd = meineKleiderfabrik.erzeugeHemd();
        Hose meineHose = meineKleiderfabrik.erzeugeHose();

        meinHemd.anzeigen();
        meineHose.anzeigen();
    }
}
