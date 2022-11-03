package jarai.patterns.excercises.observer;

public class Order {

    private final String product;
    private OrderState state;

    public Order(String product) {
        this.product = product;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void registerObserver(Person person) {

    }
}
