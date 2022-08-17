/*
 * Created on 21.03.2004
 *
 */
package behavioral.beobachter;

/**
 * @author Viktor
 *
 */
public class Firma extends Beobachter {

	private double dollarkurs;

	private final Wechselkurse wechselkurse;

	void aktualisieren() {
		dollarkurs = wechselkurse.getDollarkurs();
	}

	Firma(Wechselkurse wechselkurse) {
		this.wechselkurse = wechselkurse;
	}

	void anzeigen() {
			System.out.println("gespeicherter Kurs " + dollarkurs );
	}

}
