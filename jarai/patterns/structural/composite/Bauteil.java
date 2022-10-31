
package jarai.patterns.structural.composite;


public class Bauteil {

    protected final double preis;

    /**
     *
     */
    public Bauteil(double preis) {
        this.preis = preis;
    }

    void anzeigen() {
        System.out.println(" zum Preis von: " + preis + " EUR.");
    }

}
