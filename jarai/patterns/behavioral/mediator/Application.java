package jarai.patterns.behavioral.mediator;

public class Application {

    public static void Main(String[] args) {
        // Create chatroom

        Chatroom chatroom = new Chatroom();

        // Create participants and register them

        Participant george = new Tester("George");
        Participant paul = new Tester("Paul");
        Participant ringo = new Tester("Ringo");
        Participant john = new Tester("John");
        Participant yoko = new Developer("Yoko");

        chatroom.Register(george);
        chatroom.Register(paul);
        chatroom.Register(ringo);
        chatroom.Register(john);
        chatroom.Register(yoko);

        // Chatting participants

        yoko.Send("John", "Hi John!");
        paul.Send("Ringo", "All you need is love");
        ringo.Send("George", "My sweet Lord");
        paul.Send("John", "Can't buy me love");
        john.Send("Yoko", "My sweet love");

    }
}
