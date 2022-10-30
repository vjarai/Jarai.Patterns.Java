/*
 * Created on 27.03.2004
 *
 */
package behavioral.state.pattern;


public class Aufgelegt extends Zustand {
    public Aufgelegt() {

        super("<Hörer ist aufgelegt>");
    }

    public Zustand Abheben() {
        System.out.println("Hörer wird abgehoben.");
        return new Abgehoben();
    }

    public Zustand AnnehmenAnruf() {
        System.out.println("Anruf wird angenommen.");
        return new Verbunden();
    }
}