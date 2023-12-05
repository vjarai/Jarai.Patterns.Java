package jarai.patterns.gof.structural.decorator2;

public class LamettaDecorator extends WeihnachtsbaumDecorator {

    public LamettaDecorator(Weihnachtsbaum weihnachtsbaum) {
        super(weihnachtsbaum);
    }

    public void show() {
        dekorierterBaum.show();
        System.out.print(", mit Lametta");
    }
}
