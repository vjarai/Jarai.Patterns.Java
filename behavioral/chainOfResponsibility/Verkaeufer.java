/*
 * Created on 27.03.2004
 *
 */
package behavioral.chainOfResponsibility;


public class Verkaeufer extends Mitarbeiter {

    public Verkaeufer(String name) {
        super(name);
    }

    boolean bearbeitenAnfrage(String anfrage) {
        if (anfrage.equals("Preis")) {
            System.out.println(name + " sagt: Preis ist 99.99");
            return true;
        } else {
            System.out.println(name + " kennt " + anfrage + " nicht.");
            return false;
        }

    }


}
