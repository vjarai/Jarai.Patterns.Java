package jarai.patterns.gof.behavioral.strategy;

public class Schreiner extends Arbeiter {
    public Schreiner(String name) {
        super(name);
    }

    public void Arbeiten() {
        System.out.printf("- Schrank produziert durch '%s'%n", Name);
    }
}
