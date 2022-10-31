package jarai.patterns.behavioral.mediator;

import java.util.HashMap;

public class Chatroom {
    private final HashMap<String, ChatParticipant> _participants = new HashMap<>();

    public void Register(ChatParticipant chatParticipant) {
        if (!_participants.containsKey(chatParticipant.Name)) {
            _participants.put(chatParticipant.Name, chatParticipant);
        }

        chatParticipant.Chatroom = this;
    }

    public void Send(String from, String to, String message) {
        ChatParticipant chatParticipant = _participants.get(to);

        if (chatParticipant != null) {
            chatParticipant.Receive(from, message);
        }
    }
}
