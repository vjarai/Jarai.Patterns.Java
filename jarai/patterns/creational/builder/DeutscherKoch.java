package jarai.patterns.creational.builder;

public class DeutscherKoch extends Koch {

    public void kocheVorspeise() {
        mahlzeit += "Linsensuppe";
    }

    public void kocheHauptspeise() {
        mahlzeit += ",Schnitzel";
    }

    public void kocheNachspeise() {
        mahlzeit += ",Eis";
    }

}
