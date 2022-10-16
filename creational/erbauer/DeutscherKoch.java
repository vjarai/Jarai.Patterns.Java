package creational.erbauer;

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
