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
		meinMakrobefehl.hinzufügenBefehl( new HebeArm( meinRoboter ));
		meinMakrobefehl.hinzufügenBefehl( new HebeArm( meinRoboter ));
		meinMakrobefehl.hinzufügenBefehl( new SenkeArm( meinRoboter ));
		meinMakrobefehl.ausführen();		
		meinMakrobefehl.rückgängig();
	}
}
