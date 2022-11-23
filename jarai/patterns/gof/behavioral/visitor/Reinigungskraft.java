package jarai.patterns.gof.behavioral.visitor;


public class Reinigungskraft extends Besucher {

    void besuche(Bus e) {

        System.out.println("Reinigungskraft staubsaugt den Bus");
    }

    void besuche(Lkw e) {

        System.out.println("Reinigungskraft dampfstrahlt den Lkw");
    }

    public void putzen(Fuhrpark fuhrpark) {
        for (var fahrzeug : fuhrpark)
            fahrzeug.acceptVisitor(this);
    }
}