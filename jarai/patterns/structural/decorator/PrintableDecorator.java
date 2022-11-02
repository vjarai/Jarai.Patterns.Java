package jarai.patterns.structural.decorator;

public abstract class PrintableDecorator implements Printable {

    protected final Printable printableComponent;

    public PrintableDecorator(Printable printable) {
        this.printableComponent = printable;
    }

    public void print(String s) {
        printableComponent.print(s);
    }
}