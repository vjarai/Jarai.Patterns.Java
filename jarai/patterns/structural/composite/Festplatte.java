package jarai.patterns.structural.composite;


public class Festplatte extends Bauteil {

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