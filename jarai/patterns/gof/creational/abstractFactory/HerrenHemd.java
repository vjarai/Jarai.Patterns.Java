
package jarai.patterns.gof.creational.abstractFactory;


public class HerrenHemd extends Hemd {

    HerrenHemd(String bezeichnung, int kragenweite) {
        super(bezeichnung, kragenweite);
    }

    void anzeigen() {
        System.out.println("Herrenhose: " + super.bezeichnung + ", Groesse: " + super.kragenweite);
    }


}
