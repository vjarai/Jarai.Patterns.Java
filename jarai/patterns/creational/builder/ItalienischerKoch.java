package jarai.patterns.creational.builder;

public class ItalienischerKoch extends Koch {

    public void kocheVorspeise() {
        mahlzeit += "Antipasti";
    }

    public void kocheHauptspeise() {
        mahlzeit += ",Pizza";
    }

    public void kocheNachspeise() {
        mahlzeit += ",Zabbaione";
    }

}
