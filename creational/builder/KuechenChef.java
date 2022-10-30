package creational.builder;

public class KuechenChef {

    private final Koch koch;

    KuechenChef(Koch koch) {
        this.koch = koch;
    }

    void erstelleMahlzeit() {
        koch.kocheVorspeise();
        koch.kocheHauptspeise();
        koch.kocheNachspeise();
    }

}
