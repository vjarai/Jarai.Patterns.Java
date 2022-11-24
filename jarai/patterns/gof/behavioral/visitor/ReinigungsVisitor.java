package jarai.patterns.gof.behavioral.visitor;


public class ReinigungsVisitor extends Visitor {

    void visit(Bus e) {

        System.out.println("Reinigungskraft staubsaugt den Bus");
    }

    void visit(Lkw e) {

        System.out.println("Reinigungskraft dampfstrahlt den Lkw");
    }

}