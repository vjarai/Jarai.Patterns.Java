package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class RadioSkill extends AlexaSkill {


    public RadioSkill() {

        super("RadioSkill");
    }

    public boolean canHandleRequest(String anfrage) {
        return anfrage.contains("Radio");
    }
    public void handleRequest(String anfrage) {
        System.out.println(name + " sagt: Spiele Radio.");
    }


}
