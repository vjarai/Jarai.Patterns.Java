package jarai.patterns.gof.behavioral.command;


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
