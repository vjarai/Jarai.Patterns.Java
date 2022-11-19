
package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class Putzfrau extends Mitarbeiter {

    public Putzfrau(String name) {
        super(name);
    }

    public boolean bearbeitenAnfrage(String anfrage) {
        if (anfrage.equals("Sinn des lebens")) {
            System.out.println(name + " sagt: Spass haben.");
            return true;
        } else {
            System.out.println(name + " kennt " + anfrage + " nicht.");
            return false;
        }

    }

}
