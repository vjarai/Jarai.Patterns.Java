
package jarai.patterns.behavioral.command;


public abstract class Befehl {

    protected final Roboter roboter;

    Befehl(Roboter roboter) {
        this.roboter = roboter;
    }

    abstract void ausfuehren();

    abstract void rueckgaengig();

}