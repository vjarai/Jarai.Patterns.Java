package jarai.patterns.gof.behavioral.observer;


public class Application {

    public static void main(String[] args) {

        var publisher = new Publisher();
        var subscriber = new Subscriber();

        publisher.addPropertyChangeListener(subscriber);

        publisher.setNews("news");

    }
}
