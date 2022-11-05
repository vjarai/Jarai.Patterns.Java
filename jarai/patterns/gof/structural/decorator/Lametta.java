package jarai.patterns.gof.structural.decorator;

public class Lametta extends WeihnachtsbaumDecorator {

    public Lametta(Weihnachtsbaum weihnachtsbaum) {
        super(weihnachtsbaum);
    }

    public void print() {
        baum.print();
        System.out.print(", mit Lametta");
    }
}
