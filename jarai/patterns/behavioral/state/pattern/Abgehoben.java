
package jarai.patterns.behavioral.state.pattern;


public class Abgehoben extends Zustand {
    public Abgehoben() {
        super("<Hörer ist abgenommen>");
    }

    public Zustand Auflegen() {
        System.out.println("Hörer wird aufgelegt.");
        return new Aufgelegt();
    }

    public Zustand Waehlen() {
        System.out.println("Rufnummer wird gewählt.");
        return new Verbunden();
    }
}
