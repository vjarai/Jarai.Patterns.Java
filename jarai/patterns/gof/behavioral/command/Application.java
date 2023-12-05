package jarai.patterns.gof.behavioral.command;


public class Application {

    public static void main(String[] args) {

        var roboter = new Roboter();
        var befehl = new HebeArmBefehl();

        befehl.ausfuehren(roboter);
        befehl.rueckgaengig(roboter);


        var makroBefehl = new MakroBefehl();

        makroBefehl.add(new HebeArmBefehl());
        makroBefehl.add(new HebeArmBefehl());
        makroBefehl.add(new SenkeArmBefehl());

        makroBefehl.ausfuehren(roboter);

        makroBefehl.rueckgaengig(roboter);
    }
}
