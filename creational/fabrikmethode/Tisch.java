/*
 * Created on 27.03.2004
 *
 */
package creational.fabrikmethode;

/**
 * @author Viktor
 *
 */
public class Tisch extends Produkt {

	/**
	 * 
	 */
	
	Tisch(String bezeichnung, double preis) {
		super( bezeichnung, preis);
	}

	public void benutzen()
		{
			System.out.println("Eine Vase wird auf den Tisch gestellt.");
		}

}