package jarai.patterns.gof.behavioral.visitor;

public class GutachterVisitor extends Visitor {

    void besuche(Lkw e) {

        System.out.println("Gutachter begutachtet Lkw");
    }

    void besuche(Bus e) {

        System.out.println("Gutachter begutachtet Bus");
    }


}
