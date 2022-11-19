
package jarai.patterns.gof.creational.factoryMethod;

public class Application {

    public static void main(String[] args) {

        var ikeaWallau = new Ikea("Wallau");
        var ikeaHeidelberg = new Ikea("Heidelberg");

        var meinProdukt = ikeaWallau.verkaufen();    // Fabrikmethode aufrufen

        meinProdukt.benutzen();
        meinProdukt = null;
    }
}
