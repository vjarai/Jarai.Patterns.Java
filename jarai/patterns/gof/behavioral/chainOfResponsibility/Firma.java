package jarai.patterns.gof.behavioral.chainOfResponsibility;

import java.util.Vector;


public class Firma {

    protected final Vector<Mitarbeiter> mitarbeiter = new Vector<>();
    protected final String name;

    public Firma(String name) {
        this.name = name;
    }

    void einstellen(Mitarbeiter bearbeiter) {
        this.mitarbeiter.add(bearbeiter);
    }

    public boolean bearbeitenAnfrage(String anfrage) {

        for (var bearbeiter : mitarbeiter) {
            if (bearbeiter.bearbeitenAnfrage(anfrage))
                return true;
        }
        //	keiner hat es gewusst...
        System.out.println(name + " kennt " + anfrage + " nicht.");
        return false;
    }
}
