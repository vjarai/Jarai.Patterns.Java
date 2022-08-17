/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;

/**
 * @author Viktor
 *
 */
public class TestTreiber {

	public static void main(String[] args) {
		Roboter meinRoboter = new Roboter();
		
		MakroBefehl meinMakrobefehl = new MakroBefehl();
		meinMakrobefehl.hinzuf�genBefehl( new HebeArm( meinRoboter ));
		meinMakrobefehl.hinzuf�genBefehl( new HebeArm( meinRoboter ));
		meinMakrobefehl.hinzuf�genBefehl( new SenkeArm( meinRoboter ));
		meinMakrobefehl.ausf�hren();		
		meinMakrobefehl.r�ckg�ngig();
	}
}
