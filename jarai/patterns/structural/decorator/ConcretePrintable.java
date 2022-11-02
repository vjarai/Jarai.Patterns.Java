package jarai.patterns.structural.decorator;

public class ConcretePrintable implements Printable {
    public void print(String s) {
        System.out.print(s);
    }
}