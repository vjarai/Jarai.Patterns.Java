package jarai.patterns.gof.behavioral.chainOfResponsibility;


public class Mitarbeiter {

    public String name;

    Mitarbeiter(String name) {

        this.name = name;
    }

    public boolean bearbeitenAnfrage(String anfrage) {
        return false;
    }
}