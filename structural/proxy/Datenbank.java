/*
 * Created on 21.03.2004
 *
 */
package structural.proxy;



public class Datenbank {

    private int abfragekosten = 0;

    public String abfragenDaten(int key) {
        System.out.print("Datenbankabfrage ausgefuehrt.");
        abfragekosten++;
        return "Datensatz " + key;
    }

    void zeigeAbfragekosten() {
        System.out.println("Abfragekosten: " + abfragekosten);
    }

}
