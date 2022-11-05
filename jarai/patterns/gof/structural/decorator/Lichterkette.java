package jarai.patterns.gof.structural.decorator;

public class Lichterkette extends WeihnachtsbaumDecorator {
    private Weihnachtsbaum weihnachtsbaum;
    private boolean isBurning;

    public Lichterkette(Weihnachtsbaum weihnachtsbaum) {

        super(weihnachtsbaum);
    }

    public void einschalten() {
        isBurning = true;
    }

    public void print() {
        baum.print();
        System.out.print(", mit " + (isBurning ? "eingeschalteter" : "ausgeschalteter") + " Lichterkette");
    }
}


