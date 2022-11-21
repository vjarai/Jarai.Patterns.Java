package jarai.patterns.exercises.ex06.observer;

public class Application {

    public static void main(String[] args) {

        var myOrder = new Order("Design Patterns Book");
        var buyer = new Person("Viktor");

        myOrder.registerObserver(buyer);

        myOrder.setState(OrderState.Received);
        // ToDo: buyer receives State notification

        myOrder.setState(OrderState.Paid);
        // ToDo: buyer receives State notification

        myOrder.setState(OrderState.Shipped);
        // ToDo: buyer receives State notification

        myOrder.setState(OrderState.Received);
        // ToDo: buyer receives State notification
    }

}
