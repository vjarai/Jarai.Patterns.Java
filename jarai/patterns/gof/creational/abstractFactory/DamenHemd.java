
package jarai.patterns.gof.creational.abstractFactory;


public class DamenHemd extends Hemd {

    DamenHemd(String bezeichnung, int kragenweite) {
        super(bezeichnung, kragenweite);
    }

    void anzeigen() {
        System.out.println("Damenhemd: " + super.bezeichnung + ", Groesse: " + super.kragenweite);
    }

}
