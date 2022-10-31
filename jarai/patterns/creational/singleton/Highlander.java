
package jarai.patterns.creational.singleton;


public class Highlander {

    private static Highlander praesident;        // statisches Attribut (Klassenvariable)

    private Highlander() {
        System.out.println("Praesident wird erzeugt.");
    }


    static Highlander getInstance() {        // statische Methode (Klassenfunktion)

        if (praesident == null)            // existiert bereits ein Praesident?
        {
            praesident = new Highlander();    // nein, dann neu anlegen.
        }

        return praesident;                    // den einzigen Praesidenten zurueckliefern.
    }

    void anzeigen() {
        System.out.println("Guten Tag, ich bin der EINZIGE Praesident.");
    }

}
