package jarai.patterns.structural.decorator;

public class ConcreteOutput implements Output {

    public void print(String s) {
        System.out.print(s);
    }
}