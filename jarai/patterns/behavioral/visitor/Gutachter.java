package jarai.patterns.behavioral.visitor;

public class Gutachter extends Besucher {

    private double summe = 0;

    void besuche(Lkw e) {
        System.out.println("Gutachter begutachtet Lkw");
        summe += e.getDoubleDaten();
    }

    void besuche(Bus e) {
        System.out.println("Gutachter ignoriert Bus");
    }

    public void zeigeSumme() {
        System.out.println("Wert aller Lkw: " + summe);
    }

    public void begutachte(Iterable<Fahrzeug> fuhrpark) {
        for (var fahrzeug : fuhrpark)
            fahrzeug.acceptVisitor(this);

    }
}
