
package jarai.patterns.structural.composite;


public class Computer extends Baugruppe {

    private final String marke;

    /**
     *
     */
    public Computer(String marke, double preis) {
        super(preis);
        this.marke = marke;
    }

    void anzeigen() {
        System.out.print("Computer Marke: " + marke);
        super.anzeigen();
    }

}
