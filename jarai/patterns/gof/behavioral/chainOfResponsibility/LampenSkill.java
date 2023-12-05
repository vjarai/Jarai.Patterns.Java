package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class LampenSkill extends AlexaSkill {

    public LampenSkill() {

        super("LampenSkill");
    }

    public boolean canHandleRequest(String anfrage) {
        return anfrage.contains("Licht");
    }
    public void handleRequest(String anfrage) {
        System.out.println(name + " sagt: Licht eingeschaltet");
    }


}
