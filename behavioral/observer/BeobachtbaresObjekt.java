/*
 * Created on 21.03.2004
 *
 */
package behavioral.observer;

import java.util.LinkedList;


public abstract class BeobachtbaresObjekt {

    private final LinkedList<Beobachter> beobachterListe = new LinkedList<>();

    void anmeldenBeobachter(Beobachter beobachter) {
        beobachterListe.add(beobachter);
    }

    void benachrichtigeAlleBeobachter() {
        Beobachter beobachter;

        for (Beobachter value : beobachterListe) {
            beobachter = value;
            beobachter.aktualisieren();
        }

    }

}
