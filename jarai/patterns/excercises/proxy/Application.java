package jarai.patterns.excercises.proxy;

public class Application {

    public static void main(String[] args) {

        var myCar = new Car();

        var rentalCar = new AuthorizationCheckingCarProxy(myCar);
    }

}
