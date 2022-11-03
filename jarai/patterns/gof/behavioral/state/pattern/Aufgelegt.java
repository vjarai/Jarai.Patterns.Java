
package jarai.patterns.gof.behavioral.state.pattern;


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