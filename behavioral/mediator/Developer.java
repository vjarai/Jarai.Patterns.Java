package behavioral.mediator;

public class Developer extends Participant {

    public Developer(String name) {
        super(name);
    }

    public void Receive(String from, String message) {
        System.out.println("To a non-Tester: ");
        super.Receive(from, message);
    }
}