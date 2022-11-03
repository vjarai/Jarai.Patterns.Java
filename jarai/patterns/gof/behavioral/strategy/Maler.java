package jarai.patterns.gof.behavioral.strategy;

public class Maler extends Arbeiter {
    public Maler(String name) {
        super(name);
    }

    public void Arbeiten() {
        System.out.printf("- weiﬂe Wand produziert durch '%s'%n", Name);
    }
}
