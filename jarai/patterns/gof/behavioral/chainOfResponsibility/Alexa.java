package jarai.patterns.gof.behavioral.chainOfResponsibility;

import java.util.Vector;


public class Alexa {

    protected final Vector<AlexaSkill> skills = new Vector<>();

    void addSkill(AlexaSkill skill) {
        this.skills.add(skill);
    }

    public void bearbeitenAnfrage(String anfrage) {

        for (var skill : skills) {
            if (skill.canHandleRequest(anfrage)) {
                skill.handleRequest(anfrage);
                return;
            }
        }

        System.out.println("Entschuldigung, '" + anfrage + "' habe ich leider nicht verstanden. (Fehlt ein Skill?).");
    }
}
