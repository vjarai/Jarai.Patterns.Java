/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;

/**
 * @author Viktor
 *
 */
public class SenkeArm extends Befehl {

	public SenkeArm(Roboter roboter) {
		super(roboter);
	}

	void ausf�hren() {
		roboter.senkeArm();
	}

	void r�ckg�ngig() {
		roboter.hebeArm();
	}
}
