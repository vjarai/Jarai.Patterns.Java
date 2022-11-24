package jarai.patterns.gof.behavioral.visitor;

public class GutachterVisitor extends Visitor {

    void visit(Lkw e) {

        System.out.println("Gutachter begutachtet Lkw");
    }

    void visit(Bus e) {

        System.out.println("Gutachter begutachtet Bus");
    }


}
