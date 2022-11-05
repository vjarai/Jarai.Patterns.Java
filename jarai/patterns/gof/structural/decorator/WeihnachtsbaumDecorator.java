package jarai.patterns.gof.structural.decorator;

public abstract class WeihnachtsbaumDecorator extends Weihnachtsbaum {
    protected Weihnachtsbaum baum;

    public WeihnachtsbaumDecorator(Weihnachtsbaum baum) {

        this.baum = baum;
    }

}
