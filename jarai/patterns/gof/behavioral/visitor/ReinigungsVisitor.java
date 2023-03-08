package jarai.patterns.gof.behavioral.visitor;


public class ReinigungsVisitor extends Visitor {

    void visit(Bus bus) {

        System.out.println("Reinigungskraft staubsaugt den Bus");
    }

    void visit(Lkw lkw) {

        System.out.println("Reinigungskraft dampfstrahlt den Lkw");
    }

}