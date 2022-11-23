package jarai.patterns.gof.creational.factoryMethod;


public class Tisch extends Moebel {

    /**
     *
     */

    Tisch(String bezeichnung, double preis) {
        super(bezeichnung);
    }

    public void benutzen() {
        System.out.println("Eine Vase wird auf den Tisch gestellt.");
    }

}