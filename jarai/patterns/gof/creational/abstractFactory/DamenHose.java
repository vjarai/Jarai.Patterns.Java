package jarai.patterns.gof.creational.abstractFactory;


public class DamenHose extends Hose {

    public DamenHose(String bezeichnung, int groesse) {
        super(bezeichnung, groesse);
    }

    void anzeigen() {
        System.out.println("Damenhose: " + super.bezeichnung + ", Groesse: " + super.groesse);
    }

}
