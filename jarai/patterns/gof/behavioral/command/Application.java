package jarai.patterns.gof.behavioral.command;


public class Application {

    public static void main(String[] args) {

        var roboter = new Roboter();
        var befehl = new HebeArm();

        befehl.ausfuehren(roboter);
        befehl.rueckgaengig(roboter);


        var makroBefehl = new MakroBefehl();

        makroBefehl.add(new HebeArm());
        makroBefehl.add(new HebeArm());
        makroBefehl.add(new SenkeArm());

        makroBefehl.ausfuehren(roboter);

        makroBefehl.rueckgaengig(roboter);
    }
}
