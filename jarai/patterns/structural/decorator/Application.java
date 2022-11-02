package jarai.patterns.structural.decorator;

public class Application {


    public static void main(String[] args) {

        Printable original = new ConcretePrintable();
        Printable bracketed = new BracketDecorator(original);
        Printable stared = new StarDecorator(bracketed);

        stared.print("<String>");

        System.out.println();
    }
}