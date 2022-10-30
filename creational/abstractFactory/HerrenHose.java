/*
 * Created on 27.03.2004
 *
 */
package creational.abstractFactory;


public class HerrenHose extends Hose {


    public HerrenHose(String bezeichnung, int groesse) {
        super(bezeichnung, groesse);
    }

    void anzeigen() {
        System.out.println("Herrhose: " + super.bezeichnung + ", Groesse: " + super.groesse);
    }
}
