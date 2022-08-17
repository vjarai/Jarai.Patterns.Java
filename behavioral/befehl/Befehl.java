/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;
/**
 * @author Viktor
 *
 */
public abstract class Befehl {

	protected final Roboter roboter;

	abstract void ausf�hren();
	abstract void r�ckg�ngig();

	Befehl(Roboter roboter) {
		this.roboter = roboter;
	}
	
}