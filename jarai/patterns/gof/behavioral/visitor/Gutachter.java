package jarai.patterns.gof.behavioral.visitor;

public class Gutachter extends Besucher {

    private final double summe = 0;

    void besuche(Lkw e) {
        System.out.println("Gutachter begutachtet Lkw");
    }

    void besuche(Bus e) {

        System.out.println("Gutachter begutachtet Bus");
    }


    public void begutachte(Fuhrpark fuhrpark) {
        for (var fahrzeug : fuhrpark) {
            fahrzeug.acceptVisitor(this);
            //besuche(fahrzeug);
        }

    }
}
