/*
 * Created on 21.03.2004
 *
 */
package behavioral.beobachter;

/**
 * @author Viktor
 *
 */
public class Wechselkurse extends BeobachtbaresObjekt {

	private double dollarkurs;

	public double getDollarkurs() {
		return dollarkurs;
	}

	public void setDollarkurs(double dollarkurs) {
		this.dollarkurs = dollarkurs;
		benachrichtigeAlleBeobachter();
	}

}
