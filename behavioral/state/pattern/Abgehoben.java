/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class Abgehoben extends Zustand {
    public Abgehoben() {
        super("<H�rer ist abgenommen>");
    }

    public Zustand Auflegen() {
        System.out.println("H�rer wird aufgelegt.");
        return new Aufgelegt();
    }

    public Zustand Waehlen() {
        System.out.println("Rufnummer wird gew�hlt.");
        return new Verbunden();
    }
}
