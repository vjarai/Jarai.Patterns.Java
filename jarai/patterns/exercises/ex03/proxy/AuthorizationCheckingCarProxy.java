package jarai.patterns.exercises.ex03.proxy;

public class AuthorizationCheckingCarProxy extends Car {
    public Car car;

    public AuthorizationCheckingCarProxy(Car car) {
        // ToDo: Save original car
        this.car = car;
    }

    public boolean IsAuthorized() {
        // ToDo: Enter and check credentials
        throw new UnsupportedOperationException();
    }

    // ToDo: override car.drive() method and check authorization bevore driving


}
