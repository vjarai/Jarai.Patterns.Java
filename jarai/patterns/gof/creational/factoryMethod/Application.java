
package jarai.patterns.gof.creational.factoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Application {

    public static void main(String[] args) {
        var auswahl = 1;

        Ikea meinHaendler;
        Produkt meinProdukt;

        var IkeaWallau = new Ikea("Wallau");
        var IkeaHeidelberg = new Ikea("Heidelberg");


        do {

            System.out.println("Wo wollen Sie einkaufen (1=Ikea Wallau, 2=Ikea Heidelberg, 3=Aldi)?");

            try {
                auswahl = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            } catch (IOException e) {
                System.err.println("Caught IOException: " + e.getMessage());
            }

            switch (auswahl) {
                case 1:
                    meinHaendler = IkeaWallau;
                    break;
                case 2:
                    meinHaendler = IkeaHeidelberg;
                    break;
                default:
                    meinHaendler = null;
            }

            if (meinHaendler != null) {
                meinProdukt = meinHaendler.verkaufen();    // Fabrikmethode aufrufen

                if (meinProdukt != null)
                    meinProdukt.benutzen();

                meinHaendler.anzeigen();
            }

        } while (meinHaendler != null);

        System.out.println("Einkauf beendet.");

    }
}
