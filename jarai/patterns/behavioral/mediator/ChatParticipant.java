package jarai.patterns.behavioral.mediator;

public class ChatParticipant {
    Chatroom Chatroom;
    String Name;


    public ChatParticipant(String name) {
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