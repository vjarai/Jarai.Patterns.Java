package jarai.patterns.behavioral.visitor;


public class Putzfrau extends Besucher {

    void besuche(Bus e) {
        System.out.println("Putzfrau staubsaugt den Bus");
    }

    void besuche(Lkw e) {
        System.out.println("Putzfrau dampfstrahlt den Lkw");
    }

    public void putzen(Iterable<Fahrzeug> fuhrpark) {
        for (var fahrzeug : fuhrpark)
            fahrzeug.acceptVisitor(this);
    }
}