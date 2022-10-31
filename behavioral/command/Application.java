/*
 * Created on 28.03.2004
 *
 */
package behavioral.command;


public class Application {

    public static void main(String[] args) {
        Roboter meinRoboter = new Roboter();

        MakroBefehl meinMakrobefehl = new MakroBefehl();
        meinMakrobefehl.hinzufuegenBefehl(new HebeArm(meinRoboter));
        meinMakrobefehl.hinzufuegenBefehl(new HebeArm(meinRoboter));
        meinMakrobefehl.hinzufuegenBefehl(new SenkeArm(meinRoboter));
        meinMakrobefehl.ausfuehren();
        meinMakrobefehl.rueckgaengig();
    }
}
