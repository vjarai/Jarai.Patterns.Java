package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class Application {

    public static void main(String[] args) {

        var alexa = new Alexa();

        alexa.addSkill(new WettervorhersageSkill());
        alexa.addSkill(new LampenSkill());
        alexa.addSkill(new RadioSkill());

        alexa.bearbeitenAnfrage("Spiele Radio HR3");
        alexa.bearbeitenAnfrage("Wie wird das Wetter");
        alexa.bearbeitenAnfrage("Schalte Licht Wohnzimmer ein");
        alexa.bearbeitenAnfrage("Was ist der Sinn des Lebens?");
    }
}
