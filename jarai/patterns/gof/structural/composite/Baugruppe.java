package jarai.patterns.gof.structural.composite;

import java.util.LinkedList;


public class Baugruppe extends Bauteil {

    protected final LinkedList<Bauteil> bauteile = new LinkedList<>();        // Component interface

    public Baugruppe(String name) {
        super(name, 0);
    }

    void anzeigen() {
        super.anzeigen();

        for (var bauteil : bauteile) {
            bauteil.anzeigen();
        }

    }

    public double getPreis() {
        double preis = 0;

        for (var bauteil : bauteile) {
            preis += bauteil.getPreis();
        }
        return preis;
    }

    void hinzufuegen(Bauteil bauteil) {
        bauteile.add(bauteil);
    }

}