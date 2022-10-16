/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;


public class HebeArm extends Befehl {

    public HebeArm(Roboter roboter) {
        super(roboter);
    }

    void ausfuehren() {
        roboter.hebeArm();
    }

    void rueckgaengig() {
        roboter.senkeArm();
    }

}
