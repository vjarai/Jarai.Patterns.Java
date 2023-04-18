package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class RadioSkill extends AlexaSkill {


    public RadioSkill() {

        super("RadioSkill", "Radio");
    }

    public void handleRequest(String anfrage) {
        System.out.println(name + " sagt: Spiele Radio.");
    }


}
