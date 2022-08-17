/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;

/**
 * @author Viktor
 *
 */
public class Stuhl extends Produkt {
	public void benutzen()
	{
		System.out.println("Ich setze mich auf den Stuhl");
	}
	Stuhl(String bezeichnung, double preis) {
		super( bezeichnung, preis);
	}

}


