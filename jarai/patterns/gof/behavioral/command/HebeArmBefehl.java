package jarai.patterns.gof.behavioral.command;


public class HebeArmBefehl extends Befehl {


    void ausfuehren(Roboter roboter) {

        roboter.hebeArm();
    }

    void rueckgaengig(Roboter roboter) {
        roboter.senkeArm();
    }

}
