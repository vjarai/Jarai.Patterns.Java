package jarai.patterns.gof.behavioral.command;


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
