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

	abstract void ausführen();
	abstract void rückgängig();

	Befehl(Roboter roboter) {
		this.roboter = roboter;
	}
	
}