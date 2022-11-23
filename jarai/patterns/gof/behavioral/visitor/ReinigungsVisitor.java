package jarai.patterns.gof.behavioral.visitor;


public class ReinigungsVisitor extends Visitor {

    void besuche(Bus e) {

        System.out.println("Reinigungskraft staubsaugt den Bus");
    }

    void besuche(Lkw e) {

        System.out.println("Reinigungskraft dampfstrahlt den Lkw");
    }

}