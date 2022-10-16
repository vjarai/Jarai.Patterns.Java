/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestTreiber {

    public static void main(String[] args) {
        int auswahl = 1;

        Haendler meinHaendler;
        Produkt meinProdukt;

        Ikea IkeaWallau = new Ikea("Wallau");
        Ikea IkeaHeidelberg = new Ikea("Heidelberg");
        Aldi AldiFrankfurt = new Aldi("Frankfurt");

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
                case 3:
                    meinHaendler = AldiFrankfurt;
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
