/*
 * Created on 29.03.2004
 *
 */
package behavioral.besucher;

/**
 * @author Viktor
 *
 */
public class Bus extends Fahrzeug {

	private final int intDaten;

	public int getIntDaten() {
		return intDaten;
	}

	void nimmEntgegen(Besucher besucher){
		besucher.besuche(this);
		
	}
	Bus(int intDaten) {
		this.intDaten = intDaten;
	}

}