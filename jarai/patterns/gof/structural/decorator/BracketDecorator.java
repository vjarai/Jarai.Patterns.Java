package jarai.patterns.gof.structural.decorator;

public class BracketDecorator extends PrintableDecorator {


    public BracketDecorator(Printable printable) {
        super(printable);
    }

    public void print(String s) {
        printableComponent.print("[" + s + "]");
    }
}