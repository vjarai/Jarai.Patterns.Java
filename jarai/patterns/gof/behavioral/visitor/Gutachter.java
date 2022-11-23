package jarai.patterns.gof.behavioral.visitor;

public class Gutachter extends Besucher {

    void besuche(Lkw e) {

        System.out.println("Gutachter begutachtet Lkw");
    }

    void besuche(Bus e) {

        System.out.println("Gutachter begutachtet Bus");
    }


}
