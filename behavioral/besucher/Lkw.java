/*
 * Created on 29.03.2004
 *
 */
package behavioral.besucher;

/**
 * @author Viktor
 *
 */
public class Lkw extends Fahrzeug {

	private final double doubleDaten;

	public double getDoubleDaten() {
		return doubleDaten;
	}

	void nimmEntgegen(Besucher besucher){
		besucher.besuche(this);
	}


	Lkw(double doubleDaten) {
		this.doubleDaten = doubleDaten;
	}

}