package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class Verkaeufer extends Mitarbeiter {

    public Verkaeufer(String name) {
        super(name);
    }

    public boolean bearbeitenAnfrage(String anfrage) {
        if (anfrage.equals("Preis")) {
            System.out.println(name + " sagt: Preis ist 99.99");
            return true;
        } else {
            System.out.println(name + " kennt " + anfrage + " nicht.");
            return false;
        }

    }


}
