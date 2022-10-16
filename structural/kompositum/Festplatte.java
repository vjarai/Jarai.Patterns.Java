/*
 * Created on 21.03.2004
 *
 */
package structural.kompositum;


public class Festplatte extends Komponente {

    private final String laufwerk;

    /**
     *
     */
    public Festplatte(String laufwerk, double preis) {
        super(preis);
        this.laufwerk = laufwerk;
    }

    void anzeigen() {
        System.out.print("Festplatte " + laufwerk);
        super.anzeigen();
    }

}