package jarai.patterns.behavioral.mediator;

import java.util.HashMap;

public class Chatroom {
    private final HashMap<String, Participant> _participants = new HashMap<>();

    public void Register(Participant participant) {
        if (!_participants.containsKey(participant.Name)) {
            _participants.put(participant.Name, participant);
        }

        participant.Chatroom = this;
    }

    public void Send(String from, String to, String message) {
        Participant participant = _participants.get(to);

        if (participant != null) {
            participant.Receive(from, message);
        }
    }
}
