package jarai.patterns.gof.creational.factoryMethod;


public class Stuhl extends Moebel {
    Stuhl(String bezeichnung, double preis) {
        super(bezeichnung);
    }

    public void benutzen() {
        System.out.println("Ich setze mich auf den Stuhl");
    }

}


