package jarai.patterns.gof.structural.decorator;

public class StarDecorator extends PrintableDecorator {


    public StarDecorator(Printable printable) {
        super(printable);
    }

    public void print(String s) {
        printableComponent.print(" *** " + s + " *** ");
    }


}