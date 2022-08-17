/*
 * Created on 27.03.2004
 *
 */
package behavioral.zustand;

/**
 * @author Viktor
 *
 */
public class Telefon {

	private TelefonZustand aktuellerZustand = new HörerIstAufgelegt();

	/**
	 * 
	 */
	public Telefon() {
	}

	void wähleRufnummer(String rufnummer) {
		aktuellerZustand = aktuellerZustand.wähleRufnummer( rufnummer );
	}

	void annehmenAnruf() {
		aktuellerZustand = aktuellerZustand.annehmenAnruf();
	}

	void auflegenHörer() {
		aktuellerZustand = aktuellerZustand.auflegenHörer();
	}


	void führenUnterhaltung() {
		aktuellerZustand.führenUnterhaltung();		
	}

	void abhebenHörer() {
		aktuellerZustand = aktuellerZustand.abhebenHörer();
	}

}
