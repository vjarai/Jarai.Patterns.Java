package behavioral.state.pattern;


public class Verbunden extends Zustand {

    public Verbunden() {
        super("<Verbindung ist hergestellt>");
    }

    public Zustand Auflegen() {
        System.out.println("Hörer wird aufgelegt.");
        return new Aufgelegt();
    }

    public Zustand Sprechen() {
        System.out.println("Es wird gesprochen.");
        return this;
    }
}