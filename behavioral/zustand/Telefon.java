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

	private TelefonZustand aktuellerZustand = new H�rerIstAufgelegt();

	/**
	 * 
	 */
	public Telefon() {
	}

	void w�hleRufnummer(String rufnummer) {
		aktuellerZustand = aktuellerZustand.w�hleRufnummer( rufnummer );
	}

	void annehmenAnruf() {
		aktuellerZustand = aktuellerZustand.annehmenAnruf();
	}

	void auflegenH�rer() {
		aktuellerZustand = aktuellerZustand.auflegenH�rer();
	}


	void f�hrenUnterhaltung() {
		aktuellerZustand.f�hrenUnterhaltung();		
	}

	void abhebenH�rer() {
		aktuellerZustand = aktuellerZustand.abhebenH�rer();
	}

}
