package jarai.patterns.gof.structural.composite;


public class Bauteil {

    protected String name;

    protected final double preis;

    public Bauteil(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public double getPreis() {
        return preis;
    }

    void anzeigen() {
        System.out.println(name + " zum Preis von: " + getPreis() + " EUR.");
    }

}
