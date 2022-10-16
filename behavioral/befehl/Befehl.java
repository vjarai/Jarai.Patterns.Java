/*
 * Created on 28.03.2004
 *
 */
package behavioral.befehl;


public abstract class Befehl {

    protected final Roboter roboter;

    Befehl(Roboter roboter) {
        this.roboter = roboter;
    }

    abstract void ausfuehren();

    abstract void rueckgaengig();

}