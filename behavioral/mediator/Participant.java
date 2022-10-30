package behavioral.mediator;

public class Participant {
    Chatroom Chatroom;
    String Name;


    public Participant(String name) {
        this.Name = name;
    }


    // Sends message to given participant

    public void Send(String to, String message) {
        Chatroom.Send(Name, to, message);
    }

    // Receives message from given participant

    public void Receive(String from, String message) {
        System.out.printf("%s to %s: '{%s}'%n", from, Name, message);
    }
}