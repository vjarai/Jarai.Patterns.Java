package jarai.patterns.gof.creational.factoryMethod;


public abstract class Moebel {


    private final String bezeichnung;

    Moebel(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    abstract void benutzen();


}