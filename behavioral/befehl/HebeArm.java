/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;

/**
 * @author Viktor
 *
 */
public class HebeArm extends Befehl {

	public HebeArm(Roboter roboter) {
		super(roboter);
	}

	void ausführen() {
		roboter.hebeArm();
	}

	void rückgängig() {
		roboter.senkeArm();
	}

}
