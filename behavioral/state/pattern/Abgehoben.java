/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


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
