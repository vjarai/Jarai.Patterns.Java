package jarai.patterns.gof.structural.decorator;

public class KerzenDecorator extends WeihnachtsbaumDecorator {
    private boolean isBurning;

    public KerzenDecorator(Weihnachtsbaum weihnachtsbaum) {

        super(weihnachtsbaum);
    }

    public void anzuenden() {
        isBurning = true;
    }

    public void show() {
        dekorierterBaum.show();
        System.out.print(", mit " + (isBurning ? "brennenden" : "NICHT brennenden") + " Kerzen");
    }
}


