/*
 * Created on 27.03.2004
 *
 */
package creational.factoryMethod;


public class Stuhl extends Produkt {
    Stuhl(String bezeichnung, double preis) {
        super(bezeichnung, preis);
    }

    public void benutzen() {
        System.out.println("Ich setze mich auf den Stuhl");
    }

}


