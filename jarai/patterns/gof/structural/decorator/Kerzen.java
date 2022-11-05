package jarai.patterns.gof.structural.decorator;

public class Kerzen extends WeihnachtsbaumDecorator {
    private boolean isBurning;

    public Kerzen(Weihnachtsbaum weihnachtsbaum) {
        super(weihnachtsbaum);
    }

    public void anzuenden() {
        isBurning = true;
    }

    public void print() {
        baum.print();
        System.out.print(", mit " + (isBurning ? "brennenden" : "NICHT brennenden") + " Kerzen");
    }
}


