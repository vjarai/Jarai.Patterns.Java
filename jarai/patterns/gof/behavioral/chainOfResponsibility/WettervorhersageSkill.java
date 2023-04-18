package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class WettervorhersageSkill extends AlexaSkill {

    public WettervorhersageSkill() {
        super("WettervorhersageSkill", "Wetter");
    }

    public void handleRequest(String anfrage) {
        System.out.println(name + " sagt: Morgen scheint die Sonne.");
    }


}
