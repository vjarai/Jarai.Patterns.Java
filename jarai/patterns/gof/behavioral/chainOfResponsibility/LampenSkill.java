package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class LampenSkill extends AlexaSkill {

    public LampenSkill() {

        super("LampenSkill", "Licht");
    }

    public void handleRequest(String anfrage) {
        System.out.println(name + " sagt: Licht eingeschaltet");
    }


}
