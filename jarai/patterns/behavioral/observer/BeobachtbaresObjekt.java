
package jarai.patterns.behavioral.observer;

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
