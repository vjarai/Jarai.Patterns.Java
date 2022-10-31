
package jarai.patterns.behavioral.observer;


public class Application {

    public static void main(String[] args) {

        Wechselkurs meineWechselkurse = new Wechselkurs();
        meineWechselkurse.setDollarkurs(1.10);

        Firma meineFirma = new Firma(meineWechselkurse);
        Firma deineFirma = new Firma(meineWechselkurse);

        meineWechselkurse.anmeldenBeobachter(meineFirma);
        // meineWechselkurse.anmeldenBeobachter( deineFirma );

        // Alle angemeldeten Beobachter werden automatisch aktualisiert
        meineWechselkurse.setDollarkurs(1.25);

        meineFirma.anzeigen();
        deineFirma.anzeigen();


    }
}
