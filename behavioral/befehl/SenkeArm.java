/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;


public class SenkeArm extends Befehl {

    public SenkeArm(Roboter roboter) {
        super(roboter);
    }

    void ausfuehren() {
        roboter.senkeArm();
    }

    void rueckgaengig() {
        roboter.hebeArm();
    }
}
