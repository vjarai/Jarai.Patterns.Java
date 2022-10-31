package jarai.patterns.creational.builder;

public class RestaurantBesitzer {

    private final Koch koch;

    RestaurantBesitzer(Koch koch) {
        this.koch = koch;
    }

    void erstelleMahlzeit() {
        koch.kocheVorspeise();
        koch.kocheHauptspeise();
        koch.kocheNachspeise();
    }

}
