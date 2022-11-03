package jarai.patterns.gof.behavioral.memento;


public class Memento {

    private final String zustand;

    Memento(String zustand) {
        this.zustand = zustand;
    }

    String getZustand() {
        return zustand;
    }

}
