package jarai.patterns.gof.behavioral.mediator;

public class Developer extends ChatParticipant {

    public Developer(String name) {
        super(name);
    }

    public void Receive(String from, String message) {
        System.out.println("To a non-Tester: ");
        super.Receive(from, message);
    }
}
