/*
 * Created on 21.03.2004
 *
 */
package creational.singleton;


public class TestTreiber {

    public static void main(String[] args) {

        // Geht NICHT, da Konstruktor der KLasse Praesident private ist.
        // Praesident p = new Praesident();

        // Aufruf der Klassenfunktion getInstance()
        var p = Highlander.getInstance();    // Praesident wird erstellt...


        p = Highlander.getInstance();            // vorhandener Praesident wird zurueckgeliefert.

        p.anzeigen();

    }
}
