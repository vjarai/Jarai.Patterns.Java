package jarai.patterns.gof.behavioral.strategy;


public abstract class Arbeiter {
    protected String Name;

    public Arbeiter(String name) {
        Name = name;
    }

    public abstract void Arbeiten();
}
