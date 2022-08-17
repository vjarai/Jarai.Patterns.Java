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

	void ausf�hren() {
		roboter.hebeArm();
	}

	void r�ckg�ngig() {
		roboter.senkeArm();
	}

}
