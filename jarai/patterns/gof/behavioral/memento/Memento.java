package jarai.patterns.gof.behavioral.memento;


public class Memento {

    private final String text;

    Memento(String zustand) {
        this.text = zustand;
    }

    String getText() {
        return text;
    }

}
