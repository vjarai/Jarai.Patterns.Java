package jarai.patterns.gof.structural.decorator2;

public abstract class WeihnachtsbaumDecorator extends Weihnachtsbaum {
    protected Weihnachtsbaum dekorierterBaum;

    public WeihnachtsbaumDecorator(Weihnachtsbaum baum) {

        this.dekorierterBaum = baum;
    }

}
