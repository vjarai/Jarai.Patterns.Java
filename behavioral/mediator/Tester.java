package behavioral.mediator;

public class Tester extends Participant {
// Constructor

    public Tester(String name) {
        super(name);
    }

    public void Receive(String from, String message) {
        System.out.println("To a Tester: ");
        super.Receive(from, message);
    }
}
