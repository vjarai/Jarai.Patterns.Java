package jarai.patterns.gof.behavioral.visitor;

public class GutachterVisitor extends Visitor {

    void visit(Lkw lkw) {

        System.out.println("Gutachter begutachtet Lkw");
    }

    void visit(Bus bus) {

        System.out.println("Gutachter begutachtet Bus");
    }


}
